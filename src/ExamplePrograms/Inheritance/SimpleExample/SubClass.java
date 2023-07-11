package src.ExamplePrograms.Inheritance.SimpleExample;

public class SubClass extends SuperClass {
    protected int k;
    public SubClass(SuperClass obj, int k) {
        super(obj);
        this.k = k;
    }

    @Override
    public void show() { System.out.println(super.i + " " + j + " " + k); }
}
