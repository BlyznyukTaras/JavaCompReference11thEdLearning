package src.ExamplePrograms.Inheritance.Shapes;

public class Triangle extends BaseShape {
    protected int firstSide;
    protected int secondSide;
    protected int thirdSide;
    public Triangle (int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public int getPerimeter() { return firstSide + secondSide + thirdSide; }
    @Override
    public void calculateArea() { System.out.printf("The are of the triangle: %.2f\n", Math.sqrt(getPerimeter() *
            (getPerimeter() - firstSide) * (getPerimeter() - secondSide) * (getPerimeter() - thirdSide))); }
}
