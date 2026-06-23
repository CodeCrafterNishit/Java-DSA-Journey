public class SolidRhombusPattern {
    public static void Solid_Rhombus_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces --> 1 to n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars -->
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solid_Rhombus_Pattern(5);
    }
}
