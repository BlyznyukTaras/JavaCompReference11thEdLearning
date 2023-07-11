package src.ExamplePrograms.TaskClasses.EasyClasses;

public class Book {
    private String name;
    private String author;
    private int yearOfPublish;
    public Book() {
        name = "Some Name";
        author = "Unknown Author";
        yearOfPublish = 2000;
    }
    public Book(String name, String author, int yearOfPublish) {
        this.name = name;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }
    public Book(Book obj) {  // Initializing object constructor which creates new object that is the copy of passed
        // object in the parameter
        name = obj.name;
        author = obj.author;
        yearOfPublish = obj.yearOfPublish;
    }
    public void showBookInfo() { System.out.printf("\"%s\" by the %s, year of publishment - %d", name, author, yearOfPublish); }
}
