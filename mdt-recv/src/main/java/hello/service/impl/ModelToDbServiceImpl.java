package hello.service.impl;

import java.io.IOException;
import java.math.BigDecimal;

import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.NumberUtils;

import hello.main.Event;
import hello.mybatis.mapper.ITEF01WMapper;
import hello.mybatis.mapper.ITEF10WMapper;
import hello.mybatis.mapper.ITRF01WMapper;
import hello.mybatis.mapper.ITRF10WMapper;
import hello.mybatis.mapper.LOGD01WMapper;
import hello.mybatis.mapper.LOGD10WMapper;
import hello.mybatis.mapper.LOGD11WMapper;
import hello.mybatis.mapper.LOGD20WMapper;
import hello.mybatis.mapper.LOGD21WMapper;
import hello.mybatis.mapper.LOGD30WMapper;
import hello.mybatis.mapper.M1A201WMapper;
import hello.mybatis.mapper.PCTR01WMapper;
import hello.mybatis.mapper.RCEF01WMapper;
import hello.mybatis.mapper.RCEF10WMapper;
import hello.mybatis.mapper.RCEF11WMapper;
import hello.mybatis.mapper.RCEF20WMapper;
import hello.mybatis.mapper.RCEF21WMapper;
import hello.mybatis.mapper.RCEF30WMapper;
import hello.mybatis.mapper.RLFR01WMapper;
import hello.mybatis.mapper.RLFR10WMapper;
import hello.mybatis.mapper.RLFR11WMapper;
import hello.mybatis.mapper.RLFR20WMapper;
import hello.mybatis.mapper.RLFR21WMapper;
import hello.mybatis.mapper.RLFR30WMapper;
import hello.mybatis.model.ITEF01W;
import hello.mybatis.model.ITEF10W;
import hello.mybatis.model.ITRF01W;
import hello.mybatis.model.ITRF10W;
import hello.mybatis.model.LOGD01W;
import hello.mybatis.model.LOGD10W;
import hello.mybatis.model.LOGD11W;
import hello.mybatis.model.LOGD20W;
import hello.mybatis.model.LOGD21W;
import hello.mybatis.model.LOGD30W;
import hello.mybatis.model.M1A201W;
import hello.mybatis.model.PCTR01W;
import hello.mybatis.model.RCEF01W;
import hello.mybatis.model.RCEF10W;
import hello.mybatis.model.RCEF11W;
import hello.mybatis.model.RCEF20W;
import hello.mybatis.model.RCEF21W;
import hello.mybatis.model.RCEF30W;
import hello.mybatis.model.RLFR01W;
import hello.mybatis.model.RLFR10W;
import hello.mybatis.model.RLFR11W;
import hello.mybatis.model.RLFR20W;
import hello.mybatis.model.RLFR21W;
import hello.mybatis.model.RLFR30W;
import hello.service.LogService;
import hello.service.ModelToDbService;

@Service
public class ModelToDbServiceImpl implements ModelToDbService {

	private static final Logger log = LoggerFactory.getLogger(ModelToDbServiceImpl.class);

	// 수동커밋을 위한 트랜잭션매니저
	@Autowired
	DataSourceTransactionManager txManager;
	static final String M = "";

	// 커밋단위
	private static final int COMMIT_UNIT = 5000;

	// 이벤트 버전
	private static final String EVENT_VER2 = "2";

	// 환경변수
	@Autowired
	Environment env;

	// 에러로그
	@Autowired
	LogService logService;

	// 테이블매퍼
	@Autowired
	PCTR01WMapper PCTR01W;
	@Autowired
	ITRF01WMapper ITRF01W;
	@Autowired
	ITRF10WMapper ITRF10W;
	@Autowired
	ITEF01WMapper ITEF01W;
	@Autowired
	ITEF10WMapper ITEF10W;
	@Autowired
	LOGD01WMapper LOGD01W;
	@Autowired
	LOGD10WMapper LOGD10W;
	@Autowired
	LOGD11WMapper LOGD11W;
	@Autowired
	LOGD20WMapper LOGD20W;
	@Autowired
	LOGD21WMapper LOGD21W;
	@Autowired
	LOGD30WMapper LOGD30W;
	@Autowired
	RLFR01WMapper RLFR01W;
	@Autowired
	RLFR10WMapper RLFR10W;
	@Autowired
	RLFR11WMapper RLFR11W;
	@Autowired
	RLFR20WMapper RLFR20W;
	@Autowired
	RLFR21WMapper RLFR21W;
	@Autowired
	RLFR30WMapper RLFR30W;
	@Autowired
	RCEF01WMapper RCEF01W;
	@Autowired
	RCEF10WMapper RCEF10W;
	@Autowired
	RCEF11WMapper RCEF11W;
	@Autowired
	RCEF20WMapper RCEF20W;
	@Autowired
	RCEF21WMapper RCEF21W;
	@Autowired
	RCEF30WMapper RCEF30W;
	@Autowired
	M1A201WMapper M1A201W;

	@Override
	public String[] loadPCTR01W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		PCTR01W row = new PCTR01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setMmeAsgnUeS1apId(record.get(5));
				row.setEnbAsgnUeS1apId(record.get(6));

				if (env.getProperty("event.ver").equals(EVENT_VER2)) {
					row.setTrcId(record.get(7));
					row.setTrsrVal(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				} else {
					row.setTrsrVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				}

				result = PCTR01W.insertSelective(row);
			} catch (Exception e) {
				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);

				} catch (Exception e) {
					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {
				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadITRF01W(String fileName, Iterable<CSVRecord> records) throws IOException {

		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		ITRF01W row = new ITRF01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setMeasId(record.get(5));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				row.setLocInfoYn(record.get(9));
				row.setLatSgnVal(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setLatVal(NumberUtils.parseNumber(record.get(11), BigDecimal.class));
				row.setLotVal(NumberUtils.parseNumber(record.get(12), BigDecimal.class));
				row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(13), BigDecimal.class));
				row.setAltitudeHght(NumberUtils.parseNumber(record.get(14), BigDecimal.class));
				row.setUncertyVal(NumberUtils.parseNumber(record.get(15), BigDecimal.class));

				result = ITRF01W.insertSelective(row);
			} catch (Exception e) {
				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {
					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {
				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadITRF10W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		ITRF10W row = new ITRF10W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrqVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));

				result = ITRF10W.insertSelective(row);
			} catch (Exception e) {
				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);

				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);

				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadITEF01W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		ITEF01W row = new ITEF01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setMeasId(record.get(5));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				row.setLocInfoYn(record.get(9));
				row.setLatSgnVal(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setLatVal(NumberUtils.parseNumber(record.get(11), BigDecimal.class));
				row.setLotVal(NumberUtils.parseNumber(record.get(12), BigDecimal.class));
				row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(13), BigDecimal.class));
				row.setAltitudeHght(NumberUtils.parseNumber(record.get(14), BigDecimal.class));
				row.setUncertyVal(NumberUtils.parseNumber(record.get(15), BigDecimal.class));

				result = ITEF01W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);

			}
			log.debug("================================================");
			log.info(method + ":commit[" + rowCount + "] completed");
			log.debug("================================================");
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadITEF10W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		ITEF10W row = new ITEF10W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellId(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setCarrFreqVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setRsrqVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));

				result = ITEF10W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);

				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadLOGD01W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD01W row = new LOGD01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setEutranNcellInfoYn(record.get(7));
				row.setEutranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				row.setUtranNcellInfoYn(record.get(9));
				row.setUtranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setGeranNcellInfoYn(record.get(11));
				row.setGeranNcellCnt(NumberUtils.parseNumber(record.get(12), BigDecimal.class));
				row.setTrcRefYn(record.get(13));
				row.setUserPlmnId(record.get(14));
				row.setTrcPlmnId(record.get(15));
				row.setTrcId(record.get(16));
				row.setTrsrVal(NumberUtils.parseNumber(record.get(17), BigDecimal.class));

				if (env.getProperty("event.ver").equals(EVENT_VER2)) {
					row.setLocInfoYn(record.get(18));
					row.setLatSgnVal(NumberUtils.parseNumber(record.get(19), BigDecimal.class));
					row.setLatVal(NumberUtils.parseNumber(record.get(20), BigDecimal.class));
					row.setLotVal(NumberUtils.parseNumber(record.get(21), BigDecimal.class));
					row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(22), BigDecimal.class));
					row.setAltitudeHght(NumberUtils.parseNumber(record.get(23), BigDecimal.class));
					row.setUncertyVal(NumberUtils.parseNumber(record.get(24), BigDecimal.class));
				}

				result = LOGD01W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);

				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadLOGD10W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD10W row = new LOGD10W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = LOGD10W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.info("================================================");
			log.info(method + ":result[" + result + "]" + record.toString());
			log.info("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadLOGD11W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD11W row = new LOGD11W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setRsrqVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = LOGD11W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadLOGD20W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD20W row = new LOGD20W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = LOGD20W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadLOGD21W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD21W row = new LOGD21W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setEcnoVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = LOGD21W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadLOGD30W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		LOGD30W row = new LOGD30W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNwColorCd(record.get(2));
				row.setBtsColorCd(record.get(3));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setBandIndVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setRssiVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));

				result = LOGD30W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRLFR01W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR01W row = new RLFR01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setCellTpVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				row.setGlbalCellPlmnId(record.get(8));
				row.setGlbalCellId(NumberUtils.parseNumber(record.get(9), BigDecimal.class));
				row.setPciArfcnPciVal(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setPciArfcnCarrFreqCnt(NumberUtils.parseNumber(record.get(11), BigDecimal.class));
				row.setReestCellPlmnId(record.get(12));
				row.setReestCellId(NumberUtils.parseNumber(record.get(13), BigDecimal.class));
				row.setConnFailMeasTimeVal(NumberUtils.parseNumber(record.get(14), BigDecimal.class));
				row.setConnFailTpVal(NumberUtils.parseNumber(record.get(15), BigDecimal.class));
				row.setBefCellPlmnId(record.get(16));
				row.setBefCellId(NumberUtils.parseNumber(record.get(17), BigDecimal.class));
				row.setEutranNcellVldFlagVal(NumberUtils.parseNumber(record.get(18), BigDecimal.class));
				row.setEutranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(19), BigDecimal.class));
				row.setUtranNcellVldFlagVal(NumberUtils.parseNumber(record.get(20), BigDecimal.class));
				row.setUtranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(21), BigDecimal.class));
				row.setGeranNcellVldFlagVal(NumberUtils.parseNumber(record.get(22), BigDecimal.class));
				row.setGeranNcellCnt(NumberUtils.parseNumber(record.get(23), BigDecimal.class));
				row.setLocInfoYn(record.get(24));
				row.setLatSgnVal(NumberUtils.parseNumber(record.get(25), BigDecimal.class));
				row.setLatVal(NumberUtils.parseNumber(record.get(26), BigDecimal.class));
				row.setLotVal(NumberUtils.parseNumber(record.get(27), BigDecimal.class));
				row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(28), BigDecimal.class));
				row.setAltitudeHght(NumberUtils.parseNumber(record.get(29), BigDecimal.class));
				row.setUncertyVal(NumberUtils.parseNumber(record.get(30), BigDecimal.class));

				result = RLFR01W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRLFR10W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR10W row = new RLFR10W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = RLFR10W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);

			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadRLFR11W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR11W row = new RLFR11W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setRsrqVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = RLFR11W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadRLFR20W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR20W row = new RLFR20W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = RLFR20W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadRLFR21W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR21W row = new RLFR21W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setEcnoVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = RLFR21W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);

			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRLFR30W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RLFR30W row = new RLFR30W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNwColorCd(record.get(2));
				row.setBtsColorCd(record.get(3));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setBandIndVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setRssiVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));

				result = RLFR30W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;
	}

	@Override
	public String[] loadRCEF01W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF01W row = new RCEF01W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setFailCellId(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				row.setTxPrmbCnt(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				row.setConnDetcFlagVal(NumberUtils.parseNumber(record.get(9), BigDecimal.class));
				row.setMaxTxpwFlagVal(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setFailMeasTimeVal(NumberUtils.parseNumber(record.get(11), BigDecimal.class));
				row.setEutranNcellVldFlagVal(NumberUtils.parseNumber(record.get(12), BigDecimal.class));
				row.setEutranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(13), BigDecimal.class));
				row.setUtranNcellVldFlagVal(NumberUtils.parseNumber(record.get(14), BigDecimal.class));
				row.setUtranNcellCarrFreqCnt(NumberUtils.parseNumber(record.get(15), BigDecimal.class));
				row.setGeranNcellVldFlagVal(NumberUtils.parseNumber(record.get(16), BigDecimal.class));
				row.setGeranNcellCnt(NumberUtils.parseNumber(record.get(17), BigDecimal.class));
				row.setLocInfoYn(record.get(18));
				row.setLatSgnVal(NumberUtils.parseNumber(record.get(19), BigDecimal.class));
				row.setLatVal(NumberUtils.parseNumber(record.get(20), BigDecimal.class));
				row.setLotVal(NumberUtils.parseNumber(record.get(21), BigDecimal.class));
				row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(22), BigDecimal.class));
				row.setAltitudeHght(NumberUtils.parseNumber(record.get(23), BigDecimal.class));
				row.setUncertyVal(NumberUtils.parseNumber(record.get(24), BigDecimal.class));

				result = RCEF01W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRCEF10W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF10W row = new RCEF10W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = RCEF10W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRCEF11W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF11W row = new RCEF11W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setRsrqVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = RCEF11W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRCEF20W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF20W row = new RCEF20W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(3), BigDecimal.class));

				result = RCEF20W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRCEF21W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF21W row = new RCEF21W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setCarrFreqSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(2), BigDecimal.class));
				row.setPciVal(NumberUtils.parseNumber(record.get(3), BigDecimal.class));
				row.setRsrpVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setEcnoVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));

				result = RCEF21W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadRCEF30W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		RCEF30W row = new RCEF30W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setNcellSeq(NumberUtils.parseNumber(record.get(1), BigDecimal.class));
				row.setNwColorCd(record.get(2));
				row.setBtsColorCd(record.get(3));
				row.setArfcnVal(NumberUtils.parseNumber(record.get(4), BigDecimal.class));
				row.setBandIndVal(NumberUtils.parseNumber(record.get(5), BigDecimal.class));
				row.setRssiVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));

				result = RCEF30W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

	@Override
	public String[] loadM1A201W(String fileName, Iterable<CSVRecord> records) throws IOException {
		String method = new Object() {
		}.getClass().getEnclosingMethod().getName();

		Long startTime = System.currentTimeMillis();
		String[] loadResult = { "0", "0", "0", "0", "" };
		int rowCount = 0;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;

		M1A201W row = new M1A201W();

		Long total = 0L;
		Long sucess = 0L;
		Long fail = 0L;
		for (CSVRecord record : records) {

			int result = 0;

			if (rowCount == 0) {
				def = new DefaultTransactionDefinition();
				def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
				status = txManager.getTransaction(def);
			}

			try {
				row.setWorkDay(Event.workDay());
				row.setMdtId(record.get(0));
				row.setEnbId(record.get(1));
				row.setCellId(record.get(2));
				row.setCalId(record.get(3));
				row.setMeasTmst(record.get(4));
				row.setMeasId(record.get(5));
				row.setScellRsrpVal(NumberUtils.parseNumber(record.get(6), BigDecimal.class));
				row.setScellRsrqVal(NumberUtils.parseNumber(record.get(7), BigDecimal.class));
				row.setNcellCnt(NumberUtils.parseNumber(record.get(8), BigDecimal.class));
				row.setLocInfoYn(record.get(9));
				row.setLatSgnVal(NumberUtils.parseNumber(record.get(10), BigDecimal.class));
				row.setLatVal(NumberUtils.parseNumber(record.get(11), BigDecimal.class));
				row.setLotVal(NumberUtils.parseNumber(record.get(12), BigDecimal.class));
				row.setAltitudeSgnVal(NumberUtils.parseNumber(record.get(13), BigDecimal.class));
				row.setAltitudeHght(NumberUtils.parseNumber(record.get(14), BigDecimal.class));
				row.setUncertyVal(NumberUtils.parseNumber(record.get(15), BigDecimal.class));

				result = M1A201W.insertSelective(row);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}

			if (rowCount == COMMIT_UNIT) {
				try {
					txManager.commit(status);

					def = new DefaultTransactionDefinition();
					def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
					status = txManager.getTransaction(def);
				} catch (Exception e) {

					e.printStackTrace();
					logService.loadErrorLog(e,fileName,method);
				}
				log.debug("================================================");
				log.info(method + ":commit[" + rowCount + "] completed");
				log.debug("================================================");
				rowCount = 0;
			}

			log.debug("================================================");
			log.debug(method + ":commit[" + rowCount + "]");
			log.debug("================================================");
			rowCount++;

			log.debug("================================================");
			log.debug(method + ":result[" + result + "]" + record.toString());
			log.debug("================================================");

			if (result == 1) {
				sucess++;
			} else {
				fail++;
			}

			total++;
		}

		if (rowCount >= 1 && rowCount < COMMIT_UNIT) {
			try {
				txManager.commit(status);
			} catch (Exception e) {

				e.printStackTrace();
				logService.loadErrorLog(e,fileName,method);
			}
		}

		log.info("================================================");
		log.info(method + ":total[" + total + "]" + "sucess[" + sucess + "]" + "fail[" + fail + "]");
		log.info("================================================");

		long endTime = System.currentTimeMillis();
		long workTime = (long) ((endTime - startTime) / 1000.0);

		loadResult[0] = String.valueOf(total);
		loadResult[1] = String.valueOf(sucess);
		loadResult[2] = String.valueOf(fail);
		loadResult[3] = String.valueOf(workTime);
		loadResult[4] = fileName;

		return loadResult;

	}

}
