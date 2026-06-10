package Operators;
public class ArithmeticOperator {
    public static void main(String[] args) {
        //binary 
        int A = 100;
        int B = 50;
        System.out.println("ADD:"+ (A+B));
        System.out.println("SUBTRACT:"+ (A-B));
        System.out.println("MULTIPLY:"+ (A*B));
        System.out.println("DIVIDE:"+ (A/B));
        System.out.println("MODULUS:"+ (A%B));

        //unary 
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);
        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);
        // int a = 10;
        // int b = --a;
        // System.out.println(a);
        // System.out.println(b);
        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}
