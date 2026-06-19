public class FunctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int SumUsingInt(int a, int b) {
        return a + b;
    }

    public static float SumUsingFloat(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 8));
        System.out.println(sum(2, 3, 7));
        System.out.println(SumUsingInt(10, 20));
        System.out.println(SumUsingFloat(10.5f, 29.5f));
    }
}
