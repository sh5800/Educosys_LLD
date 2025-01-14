package loggerSimpleFactory;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);

        debugLogger.log("This is a debug msg");
        infoLogger.log("This is an info msg");
        errorLogger.log("This is an error msg");
    }
}
