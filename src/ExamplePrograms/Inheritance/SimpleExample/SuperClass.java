package src.ExamplePrograms.Inheritance.SimpleExample;

public class SuperClass {
    protected int i; // Remember that having public fields is not so good for incapsulation
    protected int j;
    public SuperClass(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public SuperClass(SuperClass obj) {
        i = obj.i;
        j = obj.j;
    }
    public void show() {
        System.out.println(i + " " + j);
    }
}
