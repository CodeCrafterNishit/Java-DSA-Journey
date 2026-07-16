package BasicMathForJava;

public class SumOfDigits {
    public static int SumDigits(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 24353;
        System.out.println(SumDigits(num));
    }
}
