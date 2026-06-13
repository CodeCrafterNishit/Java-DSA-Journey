package ConditionalStatements;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = sc.nextInt();
        System.out.println("Enter value b:");
        int b = sc.nextInt();
        System.out.println("Select the operation u want to perform -> +,-,*,/,%");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
             case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    sc.close();
    }
}
