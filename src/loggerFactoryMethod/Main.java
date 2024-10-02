package loggerFactoryMethod;

public class Main {
    public static void main(String[] args) {
        ILoggerFactory loggerFactory = new DebugLoggerFactory();
        ILogger logger =  loggerFactory.createLogger();

        logger.log("This is some message");
    }
}
