package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	public static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n  Hello World..! \n");   
		
		logger.trace("Trace message");
		logger.info("This is Info message");
		logger.error("This is error"); 
		logger.warn("This is warning");  
		logger.fatal("This is Fatal");
		
		System.out.println("\n  Completed");
		
	}

}
