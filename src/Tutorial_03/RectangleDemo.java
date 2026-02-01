package Tutorial_03;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r2.setWidth(7.8f);

        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());

        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());
    }
}
