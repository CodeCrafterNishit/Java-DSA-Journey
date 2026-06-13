import java.util.*;
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekNum = sc.nextInt();
        switch (weekNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Wrong input");
                break;
        }
    sc.close();
    }
}
