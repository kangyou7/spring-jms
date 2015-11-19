package hello.main;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import com.jolbox.bonecp.BoneCPDataSource;

import ch.qos.logback.classic.Logger;
import hello.aspect.LogAspect;
import hello.exception.ConnectionExceptionListener;
import hello.exception.ListnerExceptionHandler;
import hello.security.AesCrypto;
import hello.service.LogService;
import hello.service.ModelToDbService;
import hello.service.impl.LogServiceImpl;
import hello.service.impl.ModelToDbServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
@PropertySource("file:${location}/recv.properties")
@ImportResource("classpath:db-config.xml")
public class Application {

	final static Logger log = (Logger) LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		log.info("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			log.info(beanName);
		}
	}

	@Autowired
	Environment env;
	
	@Value("${mq}")
	private String mq;
	

	@Bean
	public ActiveMQConnectionFactory amqConnectionFactory() {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		activeMQConnectionFactory.setBrokerURL(env.getProperty("activeMQ.brokerUrl"));
		return activeMQConnectionFactory;
	}

	@Bean
	public CachingConnectionFactory connectionFactory() {
		CachingConnectionFactory cf = new CachingConnectionFactory(amqConnectionFactory());
		cf.setExceptionListener(connectionExceptionListener());
		return cf;
	}

	@Bean
	public DefaultMessageListenerContainer jmsListenerContainer() {
		DefaultMessageListenerContainer dmlc = new DefaultMessageListenerContainer();
		dmlc.setErrorHandler(listnerExceptionHandler());
		dmlc.setConnectionFactory(connectionFactory());
		dmlc.setDestination(new ActiveMQQueue(mq));
		dmlc.setMessageListener(new FileListner(env, modelToDbService()));
		dmlc.setSessionAcknowledgeMode(javax.jms.Session.CLIENT_ACKNOWLEDGE);
		dmlc.setConcurrentConsumers(Integer.parseInt(env.getProperty("mq.max")));
		return dmlc;
	}

	@Bean
	public ModelToDbService modelToDbService() {
		return new ModelToDbServiceImpl();
	}

	@Bean
	public LogService logService() {
		return new LogServiceImpl();
	}

	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}

	@Bean
	public ListnerExceptionHandler listnerExceptionHandler() {
		return new ListnerExceptionHandler();
	}
	
	@Bean
	public ConnectionExceptionListener connectionExceptionListener() {
		return new ConnectionExceptionListener();
	}

	
	@Bean
	public BoneCPDataSource dataSource() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		BoneCPDataSource b = new BoneCPDataSource();
		b.setDriverClass(env.getProperty("oracle.driver"));
		b.setJdbcUrl(env.getProperty("oracle.url"));
		b.setUsername(env.getProperty("oracle.username"));
		b.setPassword(AesCrypto.getDecode(env.getProperty("oracle.password")));

		return b;
	}
}