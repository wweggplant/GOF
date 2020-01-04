package app.command;

/**
 * ConcreteCommand
 */
public class ConcreteCommand extends Command {
    private Receiver r;

    @Override
    public void excute() {
        r.action();
    }

    public ConcreteCommand(Receiver r) {
        this.r = r;
    }
}