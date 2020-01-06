package app.ChainOfResponsibility;

/**
 * AbstractLogger
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    private AbstractLogger nextLogger;
    public AbstractLogger(int level){
        this.level = level;
    }
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message){
        if(this.level <= level){
            this.write(message);
        } else {
            this.nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}