package hello.exception;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.service.LogService;

@Component
public class ConnectionExceptionListener implements ExceptionListener {

	private static final Logger log = LoggerFactory.getLogger(ConnectionExceptionListener.class);

	@Autowired
	LogService LogService;

	@Override
	public void onException(JMSException ex) {

		log.info(ex.getMessage());

		LogService.errLog(ex);
	}

}
