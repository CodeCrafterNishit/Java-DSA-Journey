package BitwiseOperatorsJava;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        // to check for setbit count
        int n = 145;
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Set bit count = " + count);

        // to check for power of 2

        int n1 = 2;
        if ((n1 & (n1 - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not power of 2");
        }

        // to check if a number is even or odd
        int num = 43;
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is odd");
        }

        // to swap numbers without using temp
        int num1 = 4;
        int num2 = 6;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        // to find unique value
        int arr[] = { 10, 12, 10, 12, 13, 14, 14 };
        System.out.println(arr[0] ^ arr[1] ^ arr[2] ^ arr[3] ^ arr[4] ^ arr[5] ^ arr[6]);
        // to remove the last setbit
        int x = 10;
        System.out.println(x & (x - 1));
        System.out.println(x & -(x));// to find the last set bit
    }
}