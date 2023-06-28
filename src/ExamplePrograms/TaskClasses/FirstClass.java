package src.ExamplePrograms.TaskClasses;

public class FirstClass {
    private final int firstVar;
    private final int secondVar;
    private final int thirdVar;
    public FirstClass() {
        System.out.println("Constructing class with default values");
        firstVar = 69;
        secondVar = 420;
        thirdVar = 1337;
    }
    public FirstClass(int first, int second, int third) {
        System.out.println("Constructing class with different values");
        this.firstVar = first;
        this.secondVar = second;
        this.thirdVar = third;
    }
    public FirstClass(FirstClass obj) {
        firstVar = obj.firstVar;
        secondVar = obj.secondVar;
        thirdVar = obj.thirdVar;
    }
    public int getSum() {
        return firstVar + secondVar + thirdVar;
    }
}
