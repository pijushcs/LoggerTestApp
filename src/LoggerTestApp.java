import static java.lang.Thread.sleep;

public class LoggerTestApp {
    public static void main(String[] args) throws InterruptedException {
        String appName = "TestApp";
        if(args.length > 0) appName = args[0];

        LogDumper logDumper = LogDumperImpl.getDefaultLogger(); // Create LogDumper
        logDumper.registerApp(appName); // Register Application

        int testLogId = 0;
	    while(true) {
            sleep(1000);
            testLogId++;
            logDumper.info("Test log dump from " + appName + " " + testLogId);  // Log message
        }
    }
}
