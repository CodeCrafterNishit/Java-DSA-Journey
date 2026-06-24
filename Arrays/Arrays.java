import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        // int numbers[] = {1,2,3};
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy : " + marks[0]);
        System.out.println("math : " + marks[1]);
        System.out.println("chem : " + marks[2]);
        sc.close();
    }
}
