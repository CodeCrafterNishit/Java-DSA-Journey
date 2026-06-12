import java.util.*;
public class PrintOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        sc.close();
    }
}
