package Arrays;

import java.util.*;

public class Arrays_foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30 };
        for (int val : arr) {
            System.out.println(val);
        }
        int arr1[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter value for index " + i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("Your array contains:");
        for (int val : arr1) {
            System.out.println(val);
        }
        sc.close();
    }
}
// another way of accessing data instead of traditional for loop