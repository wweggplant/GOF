package app.memento;

/**
 * Memento
 */
public class Memento {
    private int atk; // 攻击力
    private int hp; // 攻击力
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