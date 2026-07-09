package Strings;

public class PracticeQuestions4 {
    public static String ReverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    public static Boolean isPalindrome(String str) {
        String original = str;
        String reverse = ReverseString(str);
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "LOL";
        System.out.print(ReverseString(str));
        System.out.println();
        System.out.println(isPalindrome(str));
    }
}
