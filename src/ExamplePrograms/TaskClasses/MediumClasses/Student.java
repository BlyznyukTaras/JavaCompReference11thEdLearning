package src.ExamplePrograms.TaskClasses.MediumClasses;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> subjects;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.subjects = new ArrayList<String>();
    }
    public Student(Student obj) {
        name = obj.name;
        age = obj.age;
        subjects = obj.subjects;
    }
    public void addSubject(String subName) {
        if (!subjects.contains(subName)) subjects.add(subName);
        else System.out.println("Subject \"" + subName + "\" is already listed");
    }
    public void showStudInfo() {
        System.out.print(name + ", age: " + age + ", list of chosen subjects: ");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.print(subjects.get(i));
            if (i < 3) System.out.print(", ");
        }
    }
}
