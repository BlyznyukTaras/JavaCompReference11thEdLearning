import src.ExamplePrograms.FirstClass;

public class ClassesDemo {
    public static void main(String[] args) {
        var someObj = new FirstClass();
        var anotherObj = new FirstClass(15, 30, 45);
        System.out.println(someObj.getSum());
        System.out.println(anotherObj.getSum() * 10);
        var copyObj = new FirstClass(anotherObj);
        System.out.println(copyObj.getSum());
    }
}
