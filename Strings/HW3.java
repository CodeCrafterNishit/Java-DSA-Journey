package Strings;

public class HW3 {
    public static int freqOfChar(String str){
        int count = 0;
        char target = 'i';
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==target) {
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        String str = "Nishit Jain";
        System.out.println(freqOfChar(str));
    }
}
