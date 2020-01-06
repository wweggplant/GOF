package app.ChainOfResponsibility;

/**
 * ConsoleLogger
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger:" + message);
    }
}