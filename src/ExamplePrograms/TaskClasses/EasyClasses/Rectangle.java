package src.ExamplePrograms.TaskClasses.EasyClasses;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle() {
        length = 4;
        width = 6;
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(Rectangle obj) {
        length = obj.length;
        width = obj.width;
    }
    public int rectArea() { return length * width; }
    public int rectPerimeter() { return 2 * (length + width); }
}
