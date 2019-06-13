package data;

import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {

		//add log4j.jar
		// add log4j properties directly inside the src folder
		//create the object in the code
		
		Logger APPLOGS =  Logger.getLogger("devpinoyLogger");
		
		APPLOGS.debug("Hello");
		APPLOGS.debug("We are writing into log file");
		APPLOGS.debug("3rd line");
		APPLOGS.debug("4th line");
	}

}
