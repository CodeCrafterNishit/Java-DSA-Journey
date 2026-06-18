public class ProductOfTwo {
    public static int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int prod = multiply(a, b);
        System.out.println("product = " + prod);
    }
}

