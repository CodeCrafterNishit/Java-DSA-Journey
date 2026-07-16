package BasicMathForJava;

public class checkPalindrome {
    public static int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static boolean CheckNumIsPalindrome(int num){
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if(originalNum==reverseNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 122;
        System.out.println(CheckNumIsPalindrome(num));
        // CheckNumIsPalindrome(num);
    }
}

