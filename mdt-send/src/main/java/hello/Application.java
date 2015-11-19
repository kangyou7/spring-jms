package hello;

import java.util.Arrays;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import ch.qos.logback.classic.Logger;
import hello.service.Watcher;

@SpringBootApplication
@PropertySource("file:${location}/send.properties")
public class Application {
	
	final static Logger log = (Logger) LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		log.debug("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			log.debug(beanName);
		}
		
		Watcher watch = ctx.getBean(Watcher.class);
		watch.init();
    }
    
	@Autowired
	Environment env;
	

	@Bean
	public ActiveMQConnectionFactory amqConnectionFactory() {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		activeMQConnectionFactory.setBrokerURL(env.getProperty("activeMQ.brokerUrl"));
		return activeMQConnectionFactory;
	}

	@Bean
	public CachingConnectionFactory connectionFactory() {
		return new CachingConnectionFactory(amqConnectionFactory());
	}

	@Bean
	public ActiveMQQueue defaultDestination() {
		return new ActiveMQQueue("incoming.queue");
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		jmsTemplate.setDefaultDestination(defaultDestination());
		return jmsTemplate;
	}
}
