package intecom.pm.Logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 


public class WriteLog {
	
	int level;
	String Logstring;
	Logger logger;
	public WriteLog(int level, String logstring){
		this.level=level;
		this.Logstring=logstring;
		this.logger = LoggerFactory.getLogger(WriteLog.class);
		//this.logger.
	}
	
	
	public void setlog(int level){
		
		switch(level){
		case 1:
			logger.debug("ducpv");
			logger.info("Hello Worlddddddddd");
			break;
		case 2:
			logger.error("errorrrrrrrrrrrrr");
			break;
		default:
			break;
				
		}
	//dd	
	}
	
} 
