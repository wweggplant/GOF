package app.strategy;

/**
 * Context
 */
public class Context {
    Strategy s;
    public Context(Strategy s) {
        this.s = s;
    }
    public void ContextInterface() {
        s.AlgorithmInterface();
    }
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStrategyA());
        c.ContextInterface();
        c = new Context(new ConcreteStrategyB());
        c.ContextInterface();
        c = new Context(new ConcreteStrategyC());
        c.ContextInterface();
    }
}