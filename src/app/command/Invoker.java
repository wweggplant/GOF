package app.command;

/**
 * Invoker
 */
public class Invoker {
    private Command c;
    public void setCommad(Command c) {
        this.c = c;
    }
    public void excuteCommad(){
        this.c.excute();
    }
}