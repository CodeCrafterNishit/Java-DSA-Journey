package BasicMathForJava;

public class printDigits {
    public static void PrintDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        int num = 51236;
        PrintDigits(num);
    }
}
