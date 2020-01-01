package app.memento;

/**
 * GameMan
 */
public class GameMan {
    private int atk; // 攻击力
    private int hp; // 攻击力
    private String log; //日志
    public GameMan(int atk, int hp){
        this.atk = atk;
        this.hp = hp;
        this.log = "log";
    }
    public int getAtk(){
        return this.atk;
    }
    public int getHp(){
        return this.hp;
    }
    public void setAtk(int atk){
        this.atk = atk;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public Memento getState(){
        return new Memento(this.atk, this.hp);
    }
    public void recoverState(Memento Memento){
        this.atk = Memento.getAtk();
        this.hp = Memento.getHp();
    }
}