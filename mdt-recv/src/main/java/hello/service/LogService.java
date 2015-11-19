package hello.service;

import javax.jms.JMSException;

public interface LogService {

	//경로명,파일명을 받아서 작업종료기록
	void endLog(String[] result);
    
	//오류를 받아서, DB에 기록
	void errLog(JMSException ex);
	
	
	void loadErrorLog(Exception e,String fileName,String method);

}
