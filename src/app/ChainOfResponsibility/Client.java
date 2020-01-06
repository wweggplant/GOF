package app.ChainOfResponsibility;

/**
 * Context
 */
public class Client {
    public static void main(String[] args) {
        Chain chain = new Chain();
        AbstractLogger loggerChain = chain.getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}