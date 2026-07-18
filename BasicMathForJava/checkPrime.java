package BasicMathForJava;

public class checkPrime {
    public static boolean CheckPrimeNum(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
      public static boolean CheckPrimeNum2(int n) {
        for (int i = 2; i*i <= n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println(CheckPrimeNum(n));
        System.out.println(CheckPrimeNum2(n));
    }
}
