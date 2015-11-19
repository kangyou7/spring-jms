package hello.main;

import java.io.File;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.FastDateFormat;

public class Event {

	public static final String TRAFFIC_MASTER_FILE = "1301_M00";
	public static final String INTRA_MASTER_FILE = "1302_M00";
	public static final String INTRA_DETAIL_FILE = "1302_D10";
	public static final String INTER_MASTER_FILE = "1303_M00";
	public static final String INTER_DETAIL_FILE = "1303_D10";
	public static final String LOGGED_MASTER_FILE = "1311_M00";
	public static final String LOGGED_DETAIL1_FILE = "1311_D10";
	public static final String LOGGED_DETAILSUB1_FILE = "1311_D11";
	public static final String LOGGED_DETAIL2_FILE = "1311_D20";
	public static final String LOGGED_DETAILSUB2_FILE = "1311_D21";
	public static final String LOGGED_DETAIL3_FILE = "1311_D30";
	public static final String RLF_MASTER_FILE = "1308_M00";
	public static final String RLF_DETAIL1_FILE = "1308_D10";
	public static final String RLF_DETAILSUB1_FILE = "1308_D11";
	public static final String RLF_DETAIL2_FILE = "1308_D20";
	public static final String RLF_DETAILSUB2_FILE = "1308_D21";
	public static final String RLF_DETAIL3_FILE = "1308_D30";
	public static final String RCEF_MASTER_FILE = "1309_M00";
	public static final String RCEF_DETAIL1_FILE = "1309_D10";
	public static final String RCEF_DETAILSUB1_FILE = "1309_D11";
	public static final String RCEF_DETAIL2_FILE = "1309_D20";
	public static final String RCEF_DETAILSUB2_FILE = "1309_D21";
	public static final String RCEF_DETAIL3_FILE = "1309_D30";
	public static final String M1A2_MASTER_FILE = "130A_M00";

	public static final String T_LOGGED_MASTER_FILE = "1208_M00";
	public static final String T_LOGGED_DETAIL1_FILE = "1208_D10";
	public static final String T_LOGGED_DETAILSUB1_FILE = "1208_D11";
	public static final String T_LOGGED_DETAIL2_FILE = "1208_D20";
	public static final String T_LOGGED_DETAILSUB2_FILE = "1208_D21";
	public static final String T_LOGGED_DETAIL3_FILE = "1208_D30";

	public static final String PCTR01W = "PCTR01W";
	public static final String ITRF01W = "ITRF01W";
	public static final String ITRF10W = "ITRF10W";
	public static final String ITEF01W = "ITEF01W";
	public static final String ITEF10W = "ITEF10W";
	public static final String LOGD01W = "LOGD01W";
	public static final String LOGD10W = "LOGD10W";
	public static final String LOGD11W = "LOGD11W";
	public static final String LOGD20W = "LOGD20W";
	public static final String LOGD21W = "LOGD21W";
	public static final String LOGD30W = "LOGD30W";
	public static final String RLFR01W = "RLFR01W";
	public static final String RLFR10W = "RLFR10W";
	public static final String RLFR11W = "RLFR11W";
	public static final String RLFR20W = "RLFR20W";
	public static final String RLFR21W = "RLFR21W";
	public static final String RLFR30W = "RLFR30W";
	public static final String RCEFR1W = "RCEFR1W";
	public static final String RCEF10W = "RCEF10W";
	public static final String RCEF11W = "RCEF11W";
	public static final String RCEF20W = "RCEF20W";
	public static final String RCEF21W = "RCEF21W";
	public static final String RCEF30W = "RCEF30W";
	public static final String M1A201W = "M1A201W";

	public static String matchTable(String fullFileName) {
		// 매개변수 파싱
		File f = new File(fullFileName);
		String event = f.getName().substring(0, 8);

		// 매칭테이블
		String table = "";
		switch (event) {
		/* 2015 상용화 */
		case TRAFFIC_MASTER_FILE:
			table = PCTR01W;
			break;
		case INTRA_MASTER_FILE:
			table = ITRF01W;
			break;
		case INTRA_DETAIL_FILE:
			table = ITRF10W;
			break;
		case INTER_MASTER_FILE:
			table = ITEF01W;
			break;
		case INTER_DETAIL_FILE:
			table = ITEF10W;
			break;

		case LOGGED_MASTER_FILE:
			table = LOGD01W;
			break;
		case LOGGED_DETAIL1_FILE:
			table = LOGD10W;
			break;
		case LOGGED_DETAILSUB1_FILE:
			table = LOGD11W;
			break;
		case LOGGED_DETAIL2_FILE:
			table = LOGD20W;
			break;
		case LOGGED_DETAILSUB2_FILE:
			table = LOGD21W;
			break;
		case LOGGED_DETAIL3_FILE:
			table = LOGD30W;
			break;

		case T_LOGGED_MASTER_FILE:
			table = LOGD01W;
			break;
		case T_LOGGED_DETAIL1_FILE:
			table = LOGD10W;
			break;
		case T_LOGGED_DETAILSUB1_FILE:
			table = LOGD11W;
			break;
		case T_LOGGED_DETAIL2_FILE:
			table = LOGD20W;
			break;
		case T_LOGGED_DETAILSUB2_FILE:
			table = LOGD21W;
			break;
		case T_LOGGED_DETAIL3_FILE:
			table = LOGD30W;
			break;

		case RLF_MASTER_FILE:
			table = RLFR01W;
			break;
		case RLF_DETAIL1_FILE:
			table = RLFR10W;
			break;
		case RLF_DETAILSUB1_FILE:
			table = RLFR11W;
			break;
		case RLF_DETAIL2_FILE:
			table = RLFR20W;
			break;
		case RLF_DETAILSUB2_FILE:
			table = RLFR21W;
			break;
		case RLF_DETAIL3_FILE:
			table = RLFR30W;
			break;
		case RCEF_MASTER_FILE:
			table = RCEFR1W;
			break;
		case RCEF_DETAIL1_FILE:
			table = RCEF10W;
			break;
		case RCEF_DETAILSUB1_FILE:
			table = RCEF11W;
			break;
		case RCEF_DETAIL2_FILE:
			table = RCEF20W;
			break;
		case RCEF_DETAILSUB2_FILE:
			table = RCEF21W;
			break;
		case RCEF_DETAIL3_FILE:
			table = RCEF30W;
			break;
		case M1A2_MASTER_FILE:
			table = M1A201W;
			break;
		}

		return table;
	}

	public static String getFileName(String fullFileName) {
		// 매개변수 파싱
		File f = new File(fullFileName);

		return f.getName();

	}

	public static String dateTime() {
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyyMMddHHmmss");
		String strDT = dayTime.format(new Date(time));
		return strDT;
	}

	public static String workDay() {

		Random rand = new Random();
		int n = rand.nextInt(999) + 0;

		long time = uniqueCurrentTimeMS();

		Format dayTime = FastDateFormat.getInstance("yyyyMMddHHmmssSSS",Locale.getDefault());

		String strDT = dayTime.format(new Date(time)) + StringUtils.leftPad(String.valueOf(n), 3, "0");

		return strDT;
	}

	private static final AtomicLong LAST_TIME_MS = new AtomicLong();

	public static long uniqueCurrentTimeMS() {
		long now = System.currentTimeMillis();
		while (true) {
			long lastTime = LAST_TIME_MS.get();
			if (lastTime >= now)
				now = lastTime + 1;
			if (LAST_TIME_MS.compareAndSet(lastTime, now))
				return now;
		}
	}

	/**
	 * 한글을 2바이트로 인식하여 반환한다.
	 * 
	 * @param str
	 * @param sLoc
	 * @param eLoc
	 * @return
	 */
	public static String getCalcStr(String str, int sLoc, int eLoc) {
		byte[] bystStr;
		String rltStr = "";
		try {
			bystStr = str.getBytes();
			rltStr = new String(bystStr, sLoc, eLoc - sLoc);
		} catch (Exception e) {
			return "";
		}
		return rltStr;
	}
}
