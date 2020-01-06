package app.ChainOfResponsibility;

/**
 * FileLogger
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger:" + message);
    }
}