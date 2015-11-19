package hello;

import java.io.File;

public class Util {
	
	public static final String  MQ_1208= "1208";
	public static final String  MQ_1301= "1301";
	public static final String  MQ_1302= "1302";
	public static final String  MQ_1303= "1303";
	public static final String  MQ_1311= "1311";
	public static final String  MQ_1308= "1308";
	public static final String  MQ_1309= "1309";
	public static final String  MQ_130A= "130A";

	
	public static String matchQueue(File f) {
	    String event = f.getName().substring(0, 4);
		String mq ="";
	    switch (event) {
	    case MQ_1208       : mq ="MQ_1208";break;
	    case MQ_1301       : mq ="MQ_1301";break; 
	    case MQ_1302       : mq ="MQ_1302";break;
	    case MQ_1303       : mq ="MQ_1303";break;
	    case MQ_1308       : mq ="MQ_1308";break;
	    case MQ_1309       : mq ="MQ_1309";break;
	    case MQ_1311       : mq ="MQ_1311";break;
	    case MQ_130A       : mq ="MQ_130A";break;
        }
		return mq;
	}
	
	public static String matchQueue(String filename) {
	    String event = filename.substring(0, 4);
		String mq ="";
	    switch (event) {
	    case MQ_1208       : mq ="MQ_1208";break;
	    case MQ_1301       : mq ="MQ_1301";break; 
	    case MQ_1302       : mq ="MQ_1302";break;
	    case MQ_1303       : mq ="MQ_1303";break;
	    case MQ_1308       : mq ="MQ_1308";break;
	    case MQ_1309       : mq ="MQ_1309";break;
	    case MQ_1311       : mq ="MQ_1311";break;
	    case MQ_130A       : mq ="MQ_130A";break;
        }
		return mq;
	}

	

}
