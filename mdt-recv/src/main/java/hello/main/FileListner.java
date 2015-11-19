package hello.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import hello.service.ModelToDbService;

@Component
/**
 * Listener Implement Spring SessionAwareMessageListener Interface
 *
 */
public class FileListner implements SessionAwareMessageListener<TextMessage> {

	private static final Logger log = LoggerFactory.getLogger(FileListner.class);

	private final Environment env;
	private final ModelToDbService modelToDbService;

	@Autowired
	public FileListner(Environment env, ModelToDbService modelToDbService) {
		this.env = env;
		this.modelToDbService = modelToDbService;
	}

	@Override
	public void onMessage(TextMessage message, Session session) throws JMSException {
		// This is the received message
		log.info("ActiveMQ로부터 받은 메세지: " + message.getText());
		String fullFileName = message.getText();
		File file = new File(fullFileName);

		// 메세지로 온 파일이 존재여부 확인후 진행
		if (!file.isFile()) {
			replyToMQ(message, session);

			log.info(fullFileName + " 처리완료");

			return;
		}
		// 이미 처리된 파일여부확인 후, DB load진행처리
		if (isDoneFile(file)) {
			log.info(fullFileName + " 이미 처리된 파일");
			FileUtils.deleteQuietly(file);
		} else {

			try {
				// DB load처리
				loadProcess(fullFileName);

				// 파일이동처리
				moveToBackup(file);

			} catch (Exception e) {
				e.printStackTrace();
				throw new JMSException(e.getLocalizedMessage() + "\n" + fullFileName + " 오류");
			}

		}

		replyToMQ(message, session);

		log.info(fullFileName + " 처리완료");

	}

	private String movePath() {

		String path = "";
		switch ((System.getenv().containsKey("windir") ? 1 : 0)) {
		case 1:
			path = env.getProperty("win.move");

			break;
		case 0:
			path = env.getProperty("unix.move");

			break;
		}

		return path;
	}

	private String loadPath() {
		String path = "";
		switch ((System.getenv().containsKey("windir") ? 1 : 0)) {
		case 1:
			path = env.getProperty("win.load");

			break;
		case 0:
			path = env.getProperty("unix.load");

			break;
		}

		return path;
	}

	private void moveToBackup(File file) throws IOException {
		String orgin = file.getParent();
		String dest = StringUtils.replace(orgin, loadPath(), movePath());

		File path = new File(dest);
		if (!path.isFile()) {
			FileUtils.forceMkdir(path);
		}

		if (file.isFile()) {
			FileUtils.moveFileToDirectory(file, path, true);
			log.info("백업경로:" + path);
			log.info(file.getAbsoluteFile() + " 백업");
		}
	}

	private boolean isDoneFile(File file) {
		boolean result = false;
		String orgin = file.getParent();
		String dest = StringUtils.replace(orgin, loadPath(), movePath());
		String backupFileName = dest + File.separator + file.getName();
		File backupFile = new File(backupFileName);
		// 백업폴더에 파일이 존재하면 이미 처리한 것으로 간주.Done => true
		if (backupFile.isFile()) {
			result = true;
		}
		return result;
	}

	private void loadProcess(String fullFileName) throws Exception {

		Reader in = new FileReader(fullFileName);
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		String fileName = Event.getFileName(fullFileName);

		switch (Event.matchTable(fullFileName)) {
		case Event.PCTR01W:
			modelToDbService.loadPCTR01W(fileName, records);
			break;
		case Event.ITRF01W:
			modelToDbService.loadITRF01W(fileName, records);
			break;
		case Event.ITRF10W:
			modelToDbService.loadITRF10W(fileName, records);
			break;
		case Event.ITEF01W:
			modelToDbService.loadITEF01W(fileName, records);
			break;
		case Event.ITEF10W:
			modelToDbService.loadITEF10W(fileName, records);
			break;
		case Event.LOGD01W:
			modelToDbService.loadLOGD01W(fileName, records);
			break;
		case Event.LOGD10W:
			modelToDbService.loadLOGD10W(fileName, records);
			break;
		case Event.LOGD11W:
			modelToDbService.loadLOGD11W(fileName, records);
			break;
		case Event.LOGD20W:
			modelToDbService.loadLOGD20W(fileName, records);
			break;
		case Event.LOGD21W:
			modelToDbService.loadLOGD21W(fileName, records);
			break;
		case Event.LOGD30W:
			modelToDbService.loadLOGD30W(fileName, records);
			break;
		case Event.RLFR01W:
			modelToDbService.loadRLFR01W(fileName, records);
			break;
		case Event.RLFR10W:
			modelToDbService.loadRLFR10W(fileName, records);
			break;
		case Event.RLFR11W:
			modelToDbService.loadRLFR11W(fileName, records);
			break;
		case Event.RLFR20W:
			modelToDbService.loadRLFR20W(fileName, records);
			break;
		case Event.RLFR21W:
			modelToDbService.loadRLFR21W(fileName, records);
			break;
		case Event.RLFR30W:
			modelToDbService.loadRLFR30W(fileName, records);
			break;
		case Event.RCEFR1W:
			modelToDbService.loadRCEF01W(fileName, records);
			break;
		case Event.RCEF10W:
			modelToDbService.loadRCEF10W(fileName, records);
			break;
		case Event.RCEF11W:
			modelToDbService.loadRCEF11W(fileName, records);
			break;
		case Event.RCEF20W:
			modelToDbService.loadRCEF20W(fileName, records);
			break;
		case Event.RCEF21W:
			modelToDbService.loadRCEF21W(fileName, records);
			break;
		case Event.RCEF30W:
			modelToDbService.loadRCEF30W(fileName, records);
			break;
		case Event.M1A201W:
			modelToDbService.loadM1A201W(fileName, records);
			break;
		default:
			log.info("매칭되는 테이블이 없는 파일명입니다");
			break;
		}
		log.info(fullFileName + " DB로드 작업성공");
		// 파일닫기
		in.close();

	}

	private void replyToMQ(TextMessage message, Session session) throws JMSException {
		// Let's prepare a reply message - a "ACK" String
		ActiveMQTextMessage textMessage = new ActiveMQTextMessage();
		textMessage.setText("ACK");

		// Message send back to the replyTo address of the income message.
		// Like replying an email somehow.
		MessageProducer producer = session.createProducer(message.getJMSReplyTo());
		producer.send(textMessage);

	}
}