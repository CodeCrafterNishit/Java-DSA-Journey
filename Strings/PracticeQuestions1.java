package Strings;

public class PracticeQuestions1 {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        String str = "NishitJain";
        printString(str);
    }
}
