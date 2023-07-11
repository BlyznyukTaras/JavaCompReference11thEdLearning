package src.ExamplePrograms.Inheritance.Employees;

public class Developer extends Employee {
    protected String codingLang;
    public Developer(Employee obj, String language) {
        super(obj);
        codingLang = language;
    }
    public Developer(Developer obj) {
        super(obj);
        codingLang = obj.codingLang;
    }
    @Override
    public void showInfo() {
        System.out.println("Empolyee: " + name + ", position: manager, " +
                "salary: " + salary + "$, coding language: " + codingLang);
    }
}
