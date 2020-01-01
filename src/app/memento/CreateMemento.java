package app.memento;

/**
 * CreateMemento
 */
public class CreateMemento {
    private Memento m;
    
    public Memento getMemento() {
        return m;
    }
    public void saveMemento(Memento m) {
        this.m = m;
    }
}