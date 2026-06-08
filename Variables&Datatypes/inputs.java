import java.util.*;
public class inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

          String name1 = sc.nextLine();
        System.out.println(name1);

        int number = sc.nextInt();
        System.out.println(number);

        Long number1 = sc.nextLong();
        System.out.println(number1);

         float decNum = sc.nextFloat();
        System.out.println(decNum);

        Boolean value = sc.nextBoolean();
        System.out.println(value);
        sc.close();
    }
}
