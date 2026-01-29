package Tutorial_02;

public class BankAccount {

    String holderName;
    double balance;
    double interestRate;

    public BankAccount(String name, double initial, double rate) {
        holderName = name;
        balance = initial;
        interestRate = rate;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void annualInterest() {
        balance += balance * interestRate;
    }

    void transfer(BankAccount other, double amount) {
        if (balance < amount + 0.5) {
            System.out.println("Not enough money!");
            return;
        }
        withdraw(amount + 0.5);
        other.deposit(amount);
    }

    public String toString() {
        return holderName + ", $" + balance;
    }
}
