package app.Mediator;

/**
 * UNmediator
 */
public class UNmediator implements Mediator {
    private Country US;
    private Country Iran;
    public void setUS(Country US) {
        this.US = US;
    }
    public void setIran(Country Iran) {
        this.Iran = Iran;
    }
    @Override
    public void sendMessage(Country c, String message) {
        if (c == US){
            this.US.getInfo(message);
        } else if(c == Iran){
            this.Iran.getInfo(message);
        }
    }
}