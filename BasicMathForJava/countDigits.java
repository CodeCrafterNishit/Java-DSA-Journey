package BasicMathForJava;

public class countDigits {
    public static int CountDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 512;
        System.out.println(CountDigits(num));
    }

}
