package Loops;
import java.util.*;

public class CheckPrimeOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
        sc.close();
    }
}
