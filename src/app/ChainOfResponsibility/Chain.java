package app.ChainOfResponsibility;

/**
 * Chain
 */
public class Chain {
    public AbstractLogger getChainOfLoggers(){
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
        error.setNextLogger(file);
        file.setNextLogger(console);
        return error;
    }
}