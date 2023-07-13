package src.ExamplePrograms.Inheritance;

import src.ExamplePrograms.Inheritance.Administration.Admin;
import src.ExamplePrograms.Inheritance.Administration.RegularUser;
import src.ExamplePrograms.Inheritance.Administration.User;
import src.ExamplePrograms.Inheritance.Employees.Developer;
import src.ExamplePrograms.Inheritance.Employees.Employee;
import src.ExamplePrograms.Inheritance.Employees.Manager;
import src.ExamplePrograms.Inheritance.Shapes.BaseShape;
import src.ExamplePrograms.Inheritance.Shapes.Circle;
import src.ExamplePrograms.Inheritance.Shapes.Rectangle;
import src.ExamplePrograms.Inheritance.Shapes.Triangle;
import src.ExamplePrograms.Inheritance.SimpleExample.SubClass;
import src.ExamplePrograms.Inheritance.SimpleExample.SuperClass;

public class Demo {
    public static void main(String[] args) {
        simpleProgram: {
            var sup = new SuperClass(1, 2);
            sup.show();
            SubClass sub = new SubClass(sup, 3);
            sub.show();
            SuperClass another = new SubClass(new SuperClass(1, 5), 2);
            another.show();
        }
        System.out.println();
        shapes: {
            BaseShape someShape = new Triangle(6, 9, 15);
            someShape.calculateArea();
            Circle circ = new Circle(6);
            circ.calculateArea();
            Rectangle rect = new Rectangle(7, 10);
            rect.calculateArea();
        }
        System.out.println();
        employees: {
            Employee employee = new Employee("Name Surname", 1500);
            employee.showInfo();
            Manager man = new Manager(new Employee("Another-Name Another-Surname", 4000), "deploying");
            man.showInfo();
            Developer dev = new Developer(new Employee("Last-Name Last-Surname", 3100), "Java");
            dev.showInfo();
        }
        System.out.println();
        admin: {
            var typical4chusername = new User("an0nym0us", "pwndtrue");
            typical4chusername.login();
            RegularUser regularUser = new RegularUser(new User("somewho1", "hispassword"));
            Admin adm = new Admin(new User("Hiiiiiiiii", "iiiiiiiiiiiiiH"), 5);
            adm.showUserInfo(regularUser);
            regularUser.changePassword("lastresort");
            adm.showUserInfo(regularUser);
        }
    }
}
