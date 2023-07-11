package src.ExamplePrograms.Inheritance.Employees;

public class Employee {
    protected String name;
    protected int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employee(Employee o) {
        name = o.name;
        salary = o.salary;
    }
    public void showInfo() { System.out.println("Employee: " + name + ", salary: " + salary + "$"); }
}
