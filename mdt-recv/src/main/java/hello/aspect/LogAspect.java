package hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import hello.service.LogService;

@Component
@Aspect
public class LogAspect {

	private static final Logger log = (Logger) LoggerFactory.getLogger(LogAspect.class);

	@Autowired
	LogService LogService;

	@Pointcut("execution(* hello.service.ModelToDbService.load*(..))")
	public void modelToDbService() {
	}

	@AfterReturning(pointcut = "modelToDbService()", returning = "result")
	public void loadAfterReturning(JoinPoint joinPoint, String[] result) {
		log.info("DB로드 후 로그작업: " + joinPoint.getSignature().getName());
		LogService.endLog(result);
	}
}
