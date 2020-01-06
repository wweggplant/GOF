package app.Mediator;

/**
 * Context
 */
public class Context {

    public static void main(String[] args) {
        UNmediator un = new UNmediator();
        USCountry us = new USCountry(un);
        IranCountry iran = new IranCountry(un);
        un.setIran(iran);
        un.setUS(us);
        iran.sendMessage("美国杀害伊朗的将军");
        us.sendMessage("伊朗将对美国施行报复行动");
    }
}