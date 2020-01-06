package app.command;

/**
 * Context
 */
public class Context {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        ConcreteCommand cc = new ConcreteCommand(r);
        Invoker invoker = new Invoker();
        invoker.setCommad(cc);
        invoker.excuteCommad();
    }
}