package AdvancedPatterns;
public class DiamondPattern {
    public static void Diamond_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces --> 1 to n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars --> 2*i - 1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spaces --> 1 to n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars --> 2*i - 1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond_Pattern(10);
    }
}
