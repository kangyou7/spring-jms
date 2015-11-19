package hello.service.impl;

import java.math.BigDecimal;

import javax.jms.JMSException;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.NumberUtils;

import hello.main.Event;
import hello.mybatis.mapper.LOG002LMapper;
import hello.mybatis.mapper.LOG003LMapper;
import hello.mybatis.model.LOG002L;
import hello.mybatis.model.LOG003L;
import hello.service.LogService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class LogServiceImpl implements LogService {

	private static final Logger log = LoggerFactory.getLogger(LogServiceImpl.class);

	@Autowired
	LOG002LMapper LOG002L;

	@Autowired
	LOG003LMapper LOG003L;

	@Override
	public void endLog(String[] result) {
		try {
			LOG002L row = new LOG002L();
			row.setWorkDay(Event.workDay());
			row.setFileNm(result[4]);
			row.setMday(StringUtils.substring(result[4], 17, 29));
			row.setOmcId(StringUtils.substring(result[4], 9, 11));
			row.setNeId(StringUtils.substring(result[4], 11, 16));
			row.setReadRowCnt(NumberUtils.parseNumber(result[0], BigDecimal.class));
			row.setInsrtSucCnt(NumberUtils.parseNumber(result[1], BigDecimal.class));
			row.setInsrtFailCnt(NumberUtils.parseNumber(result[2], BigDecimal.class));
			row.setPrcsPsgTimeVal(result[3]);

			LOG002L.insertSelective(row);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}

	@Override
	public void errLog(JMSException ex) {
		try {

			String errConts = ex.getMessage();

			log.info("errConts[" + errConts.getBytes().length + "]:" + errConts);

			if (errConts.getBytes().length > 256) {
				errConts = Event.getCalcStr(errConts, 0, 256);
			}

			LOG003L row = new LOG003L();
			row.setWorkDay(Event.workDay());
			row.setPgmNm("recv");
			row.setErrConts(errConts);

			LOG003L.insertSelective(row);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}

	@Override
	public void loadErrorLog(Exception ex, String fileName, String method) {
		try {

			String errConts = fileName + ">" + method + ">" + ex.getClass().getName() + ":" + ex.getMessage();

			log.info("errConts[" + errConts.getBytes().length + "]:" + errConts);

			if (errConts.getBytes().length > 256) {
				errConts = Event.getCalcStr(errConts, 0, 256);
			}

			LOG003L row = new LOG003L();
			row.setWorkDay(Event.workDay());
			row.setPgmNm("recv");
			row.setErrConts(errConts);

			LOG003L.insertSelective(row);
		} catch (Exception e) {
			log.info(e.getMessage());
		}

	}

}
