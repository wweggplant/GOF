package app.Mediator;

/**
 * Country
 */
public abstract class Country {
    protected String name;
    protected Mediator mediator;
    public Country(Mediator mediator) {
        this.mediator = mediator;
    }
    public void sendMessage(String message) {
        this.mediator.sendMessage(this, message);
    }
    abstract public void getInfo(String message);
}