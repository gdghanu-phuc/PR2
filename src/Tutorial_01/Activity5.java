package Tutorial_01;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of eggs: ");

        int eggs = sc.nextInt();
        int gross = eggs / 144;
        int remainder = eggs % 144;
        int dozen = remainder / 12;
        int leftover = remainder % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);

    }
}
