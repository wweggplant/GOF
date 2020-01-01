package app.memento;

/**
 * Context
 */
public class Context {

    public static void main(String[] args) {
        GameMan man = new GameMan(100, 100);
        CreateMemento cm = new CreateMemento();
        cm.saveMemento(man.getState());
        man.setAtk(101);
        man.setHp(101);
        System.out.println("修改:---攻击力:"+man.getAtk() + ", 血量: "+man.getHp());
        // 恢复
        man.recoverState(cm.getMemento());
        System.out.println("重新读档:---攻击力:"+man.getAtk() + ", 血量: "+man.getHp());
    }
}