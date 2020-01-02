package app.composite;

/**
 * Context
 */
public class Context {
    public static void main(String[] args) {
        ConcreteCompany cm1 = new ConcreteCompany("公司A");
        ConcreteCompany cm2 = new ConcreteCompany("公司B");
        ConcreteCompany cm3 = new ConcreteCompany("总公司");
        FinanceDepartment df = new FinanceDepartment("财务部");
        HRDepartment hr = new HRDepartment("人事");
        cm1.Add(df);
        cm1.Add(hr);
        cm3.Add(cm1);
        cm3.Add(cm2);
        cm3.Display(0);
    }
}