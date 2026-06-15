package Loops;
import java.util.*;

public class WhileLoopEg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n:");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
