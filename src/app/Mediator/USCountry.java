package app.Mediator;

/**
 * UScountry
 */
public class USCountry extends Country {

    public USCountry(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void getInfo(String message) {
        System.out.println("美国获得的消息:"+ message);
    }
}