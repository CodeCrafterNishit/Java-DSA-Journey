public class HW3 {
    public static void isPalindrome(int n) {
        int rev = 0;
        int num = n;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        if (num == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(101);
    }
}
