package Tutorial_01;
import java.util.Scanner;
public class Activity4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        String upperName = name.toUpperCase();
        System.out.println("Hello, " + upperName + ", nice to meet you.");
        System.out.println("Name");
    }
    }


