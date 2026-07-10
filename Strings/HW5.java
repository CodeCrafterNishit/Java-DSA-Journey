package Strings;

public class HW5 {
    public static Boolean CheckNumStr(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if('0'>ch || ch>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "12";
        System.out.println(CheckNumStr(str));
    }
}
