package Tutorial_02;

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1000, 10);
        Product p2 = new Product("Mouse", 25);

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
    }
}
