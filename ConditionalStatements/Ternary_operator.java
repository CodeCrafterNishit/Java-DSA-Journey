package ConditionalStatements;
public class Ternary_operator {
    public static void main(String[] args) {
        int num = 40;
        String type = (num % 2 == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
