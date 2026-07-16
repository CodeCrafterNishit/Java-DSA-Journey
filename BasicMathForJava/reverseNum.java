package BasicMathForJava;

public class reverseNum {
    public static int ReverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = digit + reverse * 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 2463;
        System.out.println(ReverseNum(num));
    }
}
