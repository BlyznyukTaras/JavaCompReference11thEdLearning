package src.ExamplePrograms.Inheritance.Shapes;

public class Rectangle extends BaseShape {
    protected int width;
    protected int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getPerimeter() { return 2 * (width + height); }

    @Override
    public void calculateArea() {
        System.out.printf("The area of rectangle: %d\n", width * height);
    }
}
