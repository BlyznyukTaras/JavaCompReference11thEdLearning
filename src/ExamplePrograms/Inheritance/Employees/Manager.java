package src.ExamplePrograms.Inheritance.Employees;

public class Manager extends Employee {
    protected String departmentName;
    public Manager(Employee obj, String dpName) {
        super(obj);
        departmentName = dpName;
    }
    public Manager(Manager obj) {
        super(obj);
        departmentName = obj.departmentName;
    }
    @Override
    public void showInfo() {
        System.out.println("Employee: " + name + ", position: manager, " +
                "salary: " + salary + "$, department: " + departmentName);
    }
}
