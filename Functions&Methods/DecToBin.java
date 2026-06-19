public class DecToBin {
    public static void decToBin(int n) {
        int num = n;
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int remainder = n % 2;
            bin = bin + remainder * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + num + " is : " + bin);
    }

    public static void main(String[] args) {
        decToBin(15);
    }
}
