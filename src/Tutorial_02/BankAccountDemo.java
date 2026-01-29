package Tutorial_02;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Phuc", 120, 0.05);
        BankAccount b = new BankAccount("Trang", 10, 0.05);

        a.transfer(b, 20);
        System.out.println(a);
        System.out.println(b);
    }
}
