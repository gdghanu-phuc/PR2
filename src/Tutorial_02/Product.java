package Tutorial_02;
public class Product {

    private String name;
    private double price;
    private double discount;
    private int quantity;

    static int productCount = 0;
    static double totalRevenue = 0;
    static double totalDiscount = 0;

    public Product(String name, double price, double discount, int quantity) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;

        productCount++;
        totalDiscount += discount;
        totalRevenue += (price - price * discount / 100) * quantity;
    }

    private double getImportTax() {
        return price * 0.1;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Quantity: " + quantity);
        System.out.println("Import Tax: $" + getImportTax());
        System.out.println();
    }

    public static void displayStatistics() {
        System.out.println("=== Product Statistics ===");
        System.out.println("Total Products Created: " + productCount);
        System.out.println("Total Potential Revenue: $" + totalRevenue);
        System.out.println("Average Discount: " + (totalDiscount / productCount) + "%");
    }
}