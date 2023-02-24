package a4_logFileTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A1_LogFileTest {

	public static Logger log= LoggerFactory.getLogger(A1_LogFileTest.class);
	
	public static void main(String[] args) {
		
	PropertyConfigurator.configure("C:/Users/Rohini/Desktop/Workspace/batch251/A7_FileHandlingTest/src/a4_logFileTest/log4j.properties");
	
	int i=10;
	int j=10;
	int k= i+j;
	//System.out.println("Result is "+k);
	
	log.info("Result is = "+k);
	log.error("unexpected error - network issue");
	log.error("unexpected error - db issues");
	
	}
}
