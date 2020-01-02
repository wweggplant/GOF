package app.composite;

/**
 * Company
 */
public abstract class Company {
    protected String name;
    public Company(String name){
        this.name = name;
    }
    public abstract void Add(Company c); // 添加
    public abstract void Remove(Company c);// 删除
    public abstract void Display(int depth);// 展示
    public abstract void LineOfDuty();// 履行职责
}