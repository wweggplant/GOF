package app.Mediator;

/**
 * IranCountry
 */
public class IranCountry extends Country {

    public IranCountry(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void getInfo(String message) {
        System.out.println("伊朗得到的消息:"+message);
    }
}