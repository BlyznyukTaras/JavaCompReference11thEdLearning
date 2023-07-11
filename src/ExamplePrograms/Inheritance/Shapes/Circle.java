package src.ExamplePrograms.Inheritance.Shapes;

public class Circle extends BaseShape{
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getDiameter() { return radius * 2; }
    @Override
    public void calculateArea() {
        System.out.printf("The area of the circle: %.2f\n", Math.PI * Math.pow(radius, 2));
    }
}
