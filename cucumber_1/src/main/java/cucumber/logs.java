package cucumber;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logs {

	public Logger log;
	public Logger createlog() {
		log=Logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
		return log;
	}
}
