package app.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteCompany
 */
public class ConcreteCompany extends Company {
    public ConcreteCompany(String name) {
        super(name);
    }

    private List<Company> children = new ArrayList<Company>();
    @Override
    public void Add(Company c) {
        children.add(c);
    }

    @Override
    public void Remove(Company c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }
        System.out.println(s+this.name);
        for (Company company : children) {
            company.Display(depth + 2);
        }
    }
    @Override
    public void LineOfDuty() {

    }
}