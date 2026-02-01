package Tutorial_04;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }
}
