public class BinomialCoefficient {
    public static int FactorialOfNum(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinCoeff(int n, int r) {
        int n_fact = FactorialOfNum(n);
        int r_fact = FactorialOfNum(r);
        int fact_nmr = FactorialOfNum(n - r);

        int BinCoeff = n_fact / (r_fact * fact_nmr);
        return BinCoeff;
    }

    public static void main(String[] args) {
        System.out.println(BinCoeff(5, 2));
    }
}

