package Loops;
public class WhileLoopEg5 {
    public static void main(String[] args) {
        int rev = 0;
        int n = 4537529;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
