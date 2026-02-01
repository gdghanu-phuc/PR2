package Tutorial_04;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,radius);
    }

    @Override

    public double getPerimeter() {
        return Math.pow(radius * Math.PI, 2);
    }
}
