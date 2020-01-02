package app.memento;

/**
 * Memento
 */
public class Memento {
    private int atk;
    private int hp;
    public Memento(int atk, int hp){
        this.atk = atk;
        this.hp = hp;
    }
    public int getAtk(){
        return this.atk;
    }
    public int getHp(){
        return this.hp;
    }
}