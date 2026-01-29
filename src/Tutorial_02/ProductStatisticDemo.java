package Tutorial_02;

public class ProductStatisticDemo {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1000, 10, 50);
        Product p2 = new Product("Mouse", 25, 5, 200);
        Product p3 = new Product("Keyboard", 75, 0, 100);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        Product.displayStatistics();
    }
}
