package ConditionalStatements;
public class Eg_Switch {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Mango");
                break;
            case 2:
                System.out.println("Apple");
                break;
            case 3:
                System.out.println("Banana");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
