package loggerSimpleFactory;

public class DebugLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("DEBUG: " + message);
    }
}
