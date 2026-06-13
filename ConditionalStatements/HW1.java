import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }
        sc.close();
    }
}
