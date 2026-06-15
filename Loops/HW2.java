package Loops;
import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter number:");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.println("Do you want to continue if yes press 1 if no press 0:");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
        sc.close();
    }
}
