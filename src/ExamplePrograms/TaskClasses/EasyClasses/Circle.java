package src.ExamplePrograms.TaskClasses.EasyClasses;

public class Circle {
    private int radius;
    public Circle() { radius = 5; }
    public Circle(int radius) { this.radius = radius; }
    public Circle(Circle obj) { radius = obj.radius; }
    public int GetRadius() { return radius; }
    public double areaOfCircle() { return Math.pow(radius, 2) * 3.14; }
    public double lengthOfCircle() { return 2 * radius * 3.14; }
}