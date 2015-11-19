package hello.exception;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

import hello.service.LogService;

@Component
public class ListnerExceptionHandler implements ErrorHandler {

	private static final Logger log = LoggerFactory.getLogger(ListnerExceptionHandler.class);
	
	@Autowired
	LogService LogService;
	
	@Override
	public void handleError(Throwable t) {
		
		JMSException ex = (JMSException) t;
		
		log.info(ex.getMessage());
		
		LogService.errLog(ex);
	}

}
