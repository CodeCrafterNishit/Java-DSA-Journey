package BasicMathForJava;

public class PowerOfNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int ans = 1;
        for(int i = 1;i<=b;i++){
            ans = ans * a;
        }
        System.out.println("Answer : " + ans);
    }
}
