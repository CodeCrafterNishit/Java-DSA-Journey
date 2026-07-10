package Strings;
public class  HW1{
    public static int CountConsonants(String str){
       int count = 0;
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
            count++;
        }
       }
       return count;
    }
    public static void main (String[] args){
        String str = "niv";
        System.out.println(CountConsonants(str));
    }
}