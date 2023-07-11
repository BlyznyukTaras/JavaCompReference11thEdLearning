package src.ExamplePrograms.TaskClasses.MediumClasses;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> subjects;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.subjects = new ArrayList<String>(); // List of string values of the subjects that the student chose
    }
    public Student(Student obj) {
        name = obj.name;
        age = obj.age;
        subjects = obj.subjects;
    }
    public void addSubject(String subName) {
        if (!subjects.contains(subName)) subjects.add(subName); // If the subject's name isn't availabe in the list
        // add it to the list
        else System.out.println("Subject \"" + subName + "\" is already listed"); // Else give the message that this
        // action is impossible
    }
    public void showStudInfo() {
        System.out.print(name + ", age: " + age + ", list of chosen subjects: ");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.print(subjects.get(i)); // Showing the names of subjects
            if (i < subjects.size() - 1) System.out.print(", "); // While iteration isn't last add the coma to output
        }
        System.out.println();
    }
}
