package Strings;

public class PracticeQuestions2 {
    public static int findLengthOfString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "NishitJain";
        System.out.println(findLengthOfString(str));
    }
}
