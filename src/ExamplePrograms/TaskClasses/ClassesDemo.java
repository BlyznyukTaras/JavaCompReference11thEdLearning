package src.ExamplePrograms.TaskClasses;

import src.ExamplePrograms.TaskClasses.EasyClasses.Book;
import src.ExamplePrograms.TaskClasses.EasyClasses.Circle;
import src.ExamplePrograms.TaskClasses.EasyClasses.Rectangle;
import src.ExamplePrograms.TaskClasses.MediumClasses.BankAccount;
import src.ExamplePrograms.TaskClasses.MediumClasses.Car;
import src.ExamplePrograms.TaskClasses.MediumClasses.Student;

public class ClassesDemo {
    public static void main(String[] args) {
        firstClass: {
            var someObj = new FirstClass();
            var anotherObj = new FirstClass(15, 30, 45);
            System.out.println(someObj.getSum());
            System.out.println(anotherObj.getSum() * 10);
            var copyObj = new FirstClass(anotherObj);
            System.out.println(copyObj.getSum());
        }
        System.out.println();
        bookClass: {
            var ktBook = new Book("Head First Kotlin", "Dawn Griffiths and David Griffiths", 2019);
            ktBook.showBookInfo();
        }
        System.out.println();
        circleClass: {
            var genericCircle = new Circle(8);
            System.out.println("\nRadius of circle: " + genericCircle.GetRadius() +
                    ", its area: " + genericCircle.areaOfCircle() + ", its length: " + genericCircle.lengthOfCircle());
        }
        System.out.println();
        rectangleClass: {
            var genericRect = new Rectangle(17, 25);
            System.out.printf("The area of your rectange: %d, " +
                    "its perimeter: %d\n", genericRect.rectArea(), genericRect.rectPerimeter());
        }
        System.out.println();
        bankAccountClass: {
            var bankAcc = new BankAccount("Peter Piper");
            bankAcc.addToBal(500); bankAcc.withdrawFromBal(150);
            bankAcc.withdrawFromBal(650);
            bankAcc.outputInfo();
        }
        System.out.println();
        carClass: {
            var someCar = new Car();
            someCar.speedUp(200);
            someCar.speedUp(50);
            someCar.slowDown(125);
            someCar.outputInfo();
        }
        System.out.println();
        studentClass: {
            var someStudent = new Student("Laborant Chair", 18);
            someStudent.addSubject("Mathematical analysis");
            someStudent.addSubject("Object-oriented programming");
            someStudent.addSubject("Algorithms and data structures");
            someStudent.addSubject("Foreign language");
            someStudent.showStudInfo();
        }
    }
}
