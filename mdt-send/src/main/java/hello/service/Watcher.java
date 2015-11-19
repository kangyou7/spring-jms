package hello.service;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.List;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import hello.Util;

@Component
public class Watcher {

	private static final Logger log = LoggerFactory.getLogger(Watcher.class);

	@Autowired
	JmsMessageSender jmsMessageSender;

	@Autowired
	Environment env;

	/**
	 * 최초실행시, loadPath에 있는 파일리스트를 ActiveMQ로 전송 이후에는 신규파일이 생성될때만 ActiveMQ로 전송
	 * 
	 * @throws IOException
	 */
	public void init() throws IOException {
		log.info("=============================================");
		log.info(">>>>>>Start JobControl.process() to send file list to ActiveMQ.");
		log.info("=============================================");

		// 현재 경로의 파일리스트 생성.dat확장자만 추출
		File dir = new File(loadPath());
		String[] extensions = new String[] { "dat" };
		List<File> Files = (List<File>) FileUtils.listFiles(dir, extensions, true);

		// 파일리스트 MQ전송
		log.info("=============================================");
		log.info("sending file size:" + Files.size());
		log.info("=============================================");

		if (Files.size() > 0) {
			for (File f : Files) {
				log.info(f.getAbsoluteFile().toString());
				// send to default destination

				if (!"".equals(Util.matchQueue(f))) {
					jmsMessageSender.send(new ActiveMQQueue(Util.matchQueue(f)), f.getAbsoluteFile().toString());
				}
			}
			log.info("=============================================");
			log.info("Ended sending File name");
			log.info("=============================================");

		}

		log.info("=============================================");
		log.info("<<<<<<End JobControl.process() to send file list to ActiveMQ.");
		log.info("=============================================");

		// 신규파일 등록 감시
		// loadpath하위폴더 찾기
		Collection<File> fs = FileUtils.listFilesAndDirs(new File(loadPath()), FileFilterUtils.directoryFileFilter(),
				FileFilterUtils.directoryFileFilter());
		// loadpath를 제외하고, 하위폴더 new파일 감시등록.
		for (final File f : fs) {
			if (f.getPath().equals(loadPath())) {

			} else {
				new Thread(new Runnable() {

					@Override
					public void run() {
						Path folder = Paths.get(f.getPath());
						watchDirectoryPath(folder);
					}
				}).start();
			}
		}

	}

	/**
	 * 신규파일 생성되면, ActiveMQ로 파일명 전송
	 * 
	 * @param path
	 */
	@SuppressWarnings("unchecked")
	public void watchDirectoryPath(Path path) {
		// Sanity check - Check if path is a folder
		try {
			Boolean isFolder = (Boolean) Files.getAttribute(path, "basic:isDirectory", NOFOLLOW_LINKS);
			if (!isFolder) {
				throw new IllegalArgumentException("Path: " + path + " is not a folder");
			}
		} catch (IOException ioe) {
			// Folder does not exists
			ioe.printStackTrace();
		}

		log.info("Watching path: " + path);

		// We obtain the file system of the Path
		FileSystem fs = path.getFileSystem();

		// We create the new WatchService using the new try() block
		try (WatchService service = fs.newWatchService()) {

			// We register the path to the service
			// We watch for creation events
			path.register(service, ENTRY_CREATE);

			// Start the infinite polling loop
			WatchKey key = null;
			while (true) {
				key = service.take();

				// Dequeueing events
				Kind<?> kind = null;
				for (WatchEvent<?> watchEvent : key.pollEvents()) {
					// Get the type of the event
					kind = watchEvent.kind();
					if (OVERFLOW == kind) {
						continue; // loop
					} else if (ENTRY_CREATE == kind) {
						// A new Path was created
						Path newPath = ((WatchEvent<Path>) watchEvent).context();
						if (StringUtils.getFilenameExtension(newPath.toString()).equals("dat")) {
							String fullFileName = path.toString() + File.separator + newPath.toString();
							// Output
							if (!"".equals(Util.matchQueue(newPath.toString()))) {
								log.info("New path created: " + fullFileName);
								jmsMessageSender.send(new ActiveMQQueue(Util.matchQueue(newPath.toString())),
										fullFileName);
							}
						}
					}
				}

				if (!key.reset()) {
					break; // loop
				}
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	/**
	 * send.properties에 등록된 loadPath를 OS에 따라 선택
	 * 
	 * @return
	 */
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

}
