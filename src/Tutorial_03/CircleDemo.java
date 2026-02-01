package Tutorial_03;

public class CircleDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.0, "blue");
        Circle c2 = new Circle(2.0, "red");
        Circle c3 = new Circle(3.0, "red");

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
    }
}
