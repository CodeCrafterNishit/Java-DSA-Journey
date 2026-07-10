package Strings;

public class HW2 {
    public static String convertUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
            return result.toString();
    }

    public static void main(String[] args) {
        String str = "nishit jain";
        System.out.println(convertUpperCase(str));
    }
}
