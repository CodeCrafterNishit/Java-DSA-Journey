public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 8, b = 9, c = 10;
        if (a >= b && a >= c) {
            System.out.println("A is greatest");
        } else if (b >= c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}
