package BasicMathForJava;

public class GCD {
    public static int GCDOfNum(int a, int b) {
        // gcd(a,b) = gcd(b,a%b)
        while (b != 0) {
            int oldValueOfB = b;
            b = a % b;
            a = oldValueOfB;
        }
        int ans = a;
        return ans;
    }

    public static int getLCM(int a,int b){
        int gcd = GCDOfNum(a, b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(GCDOfNum(a, b));
        System.out.println(getLCM(a, b));
    }
}
