package Functions&Methods;

import java.util.*;

public class FncWithParamsEg {
    public static int calculateSum(int num1, int num2) { //parameters or formal parameters (during fnc definition)
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguements or actual parameters (during fnc call)
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
