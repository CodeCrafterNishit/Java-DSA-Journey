public class BinToDec {
    public static void binToDec(int n) {
        int num = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastDig = n % 10;
            dec = dec + (lastDig * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("decimal of " + num + " is : " + dec);
    }

    public static void main(String[] args) {
        binToDec(10);
    }
}
