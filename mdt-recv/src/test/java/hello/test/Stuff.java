package hello.test;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Driver;
import java.util.Collection;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import hello.main.Event;
import hello.security.AesCrypto;

public class Stuff {

	private static final Logger log = LoggerFactory.getLogger(Stuff.class);

	@Test
	public void test1() {

		File backupFile = new File("C:\\mdt\\data\\load_backup\\TS\\1303_M00_201510161255.dat");
		// 백업폴더에 파일이 존재하면 이미 처리한 것으로 간주.Done => true
		log.info("backupFile:" + backupFile.getAbsoluteFile());
		if (backupFile.isFile()) {
			log.info("backupFile:" + backupFile.getAbsoluteFile() + " is existed");
		} else {
			log.info("backupFile:" + backupFile.getAbsoluteFile() + " is not existed");
		}
	}

	@Test
	public void test2() {
		String root = "c:\\mdt\\data\\load\\TS";
		File r = new File(root);
		Collection<File> fs = FileUtils.listFilesAndDirs(r, FileFilterUtils.directoryFileFilter(),
				FileFilterUtils.directoryFileFilter());
		for (File f : fs) {
			if (f.getPath().equals(root)) {

			} else {
				log.info(f.getPath());
			}
		}
	}

	@Test
	public void test3() throws IOException {
		String file = "c:\\mdt\\data\\load\\DD\\1.dat";
		String backup = "c:\\mdt\\data\\load_backup";
		String load = "c:\\mdt\\data\\load";

		File f = new File(file);
		String path = f.getParent();
		log.info(path);

		String newOne = StringUtils.replace(path, load, backup);
		log.info(newOne);
		File f2 = new File(newOne);
		if (!f.isFile()) {
			FileUtils.forceMkdir(f2);
		}

	}

	@Test
	public void test4() {
		String file = "c:\\mdt\\data\\load\\DD\\1.dat";
		// log.info(StringUtils.getFilenameExtension(file));
	}

	@Test
	public void test5() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException {
		log.info("암호화");
		String key = "ahqkdlfwlvy01";
		log.info("key:" + key);
		String encryptedKey = AesCrypto.getEncode(key);
		log.info("Encoded key:" + encryptedKey);
		log.info("Decoded key:" + AesCrypto.getDecode(encryptedKey));
	}

	@Test
	public void test6() throws ClassNotFoundException {

		String classname = "oracle.jdbc.driver.OracleDriver";
		@SuppressWarnings("unchecked")
		Class<? extends Driver> c = (Class<? extends Driver>) Class.forName(classname);
		InnerTest i = new InnerTest();
		i.setDriverClass(c);

	}

	public class InnerTest {

		@SuppressWarnings("unused")
		private Driver driver;

		public void setDriverClass(Class<? extends Driver> driverClass) {
			this.driver = BeanUtils.instantiateClass(driverClass);
		}

	}

	@Test
	public void workday() {
		log.info("==========================================================================");
		for (int i = 0; i < 100; i++) {
			String work_day = Event.workDay();
			if (work_day.equals(Event.workDay())) log.info(" Event.workDay():" + work_day + ",length=" + work_day.length()); 
			
			log.info(" Event.workDay():" + work_day + ",length=" + work_day.length());
		
		}
		log.info("==========================================================================");
		
		log.info(org.apache.commons.lang.StringUtils.substring("1308_M00_CZTSS14_201511031030.dat", 9, 11));
		log.info(org.apache.commons.lang.StringUtils.substring("1308_M00_CZTSS14_201511031030.dat", 11, 16));
		log.info(org.apache.commons.lang.StringUtils.substring("1308_M00_CZTSS14_201511031030.dat", 17, 29));

		log.info(String.valueOf(StringUtils.lastIndexOf("1308_M00_CZTSS14_201511031030.DAT", "DAT")));
		log.info(String.valueOf(StringUtils.replace("1308_M00_CZTSS14_201511031030.DAT", ".DAT", ".FIN")));
	}

	@Test
	public void nanotime() {
		for (int i = 0; i < 1; i++) {
			long startTime = System.nanoTime();
			long duration = System.nanoTime() - startTime;
			log.info("gap:" + String.valueOf(duration));
		}
	}

}
