package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// log levels : T-trace, D-debug, I-info, W-warn, E-error, F-fatal
public class LoggingDemo {
	private static Logger Logger = LogManager.getLogger(LoggingDemo.class);

	public static void main(String[] args) {
		// System.out.println(); //never use this
		Logger.fatal("Fatal message");
		Logger.debug("this is a debug message");
		Logger.error("Error message");
		Logger.warn("warning message");
		Logger.trace("trace message");
		Logger.info("information");

	}

}
