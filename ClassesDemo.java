import src.ExamplePrograms.FirstClass;
import src.ExamplePrograms.TaskClasses.EasyClasses.Book;
import src.ExamplePrograms.TaskClasses.EasyClasses.Circle;
import src.ExamplePrograms.TaskClasses.EasyClasses.Rectangle;

public class ClassesDemo {
    public static void main(String[] args) {
        var someObj = new FirstClass();
        var anotherObj = new FirstClass(15, 30, 45);
        System.out.println(someObj.getSum());
        System.out.println(anotherObj.getSum() * 10);
        var copyObj = new FirstClass(anotherObj);
        System.out.println(copyObj.getSum());
        var ktBook = new Book("Head First Kotlin", "Dawn Griffiths and David Griffiths", 2019);
        ktBook.showBookInfo();
        var genericCircle = new Circle(8);
        System.out.println("\nRadius of circle: " + genericCircle.GetRadius() +
                ", its area: " + genericCircle.areaOfCircle() + ", its length: " + genericCircle.lengthOfCircle());
        var genericRect = new Rectangle(17, 25);
        System.out.printf("The area of your rectange: %d, " +
                "its perimeter: %d", genericRect.rectArea(), genericRect.rectPerimeter());
    }
}
