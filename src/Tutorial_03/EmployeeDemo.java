package Tutorial_03;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee phuc = new Employee(1, "Phuc", 1000);
        System.out.println(phuc);

        phuc.raiseSalary(20);
        System.out.println("After raising salary, Phuc gets: " + phuc + "per month");
    }
}
