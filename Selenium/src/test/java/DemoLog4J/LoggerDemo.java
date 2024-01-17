package DemoLog4J;
import org.apache.logging.log4j.*;
public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger("LoggerDemo");
		System.out.println("This is logger demo.");
		
		
		log.info("For info only");
		log.debug("For debug");
		log.error("Error Message");
		log.warn("warning message");
	}

}
