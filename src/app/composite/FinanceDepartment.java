package app.composite;

/**
 * FinanceDepartment
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {

    }

    @Override
    public void Remove(Company c) {

    }

    @Override
    public void Display(int depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }
        System.out.println(s + this.name);
    }

    @Override
    public void LineOfDuty() {

    }
}