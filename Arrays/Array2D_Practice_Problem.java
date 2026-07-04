package Arrays;

public class Array2D_Practice_Problem {
    public static void main(String[] args) {
        // taking sum of 2D array
        int arr[][] = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
        }
        System.out.println("total of this 2D array is : " + sum);
        //taking multiplication of 2d array
        int arr1[][] = {
                { 1, 2 }, { 3, 4 }
        };
        int ans = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int value = arr1[i][j];
                ans = ans * value;
            }
        }
        System.out.println("multiplication of this 2D array is : " + ans);
        //find maximum
        int arr2[][] = { { 1, 2, 3 }, { 21, 15, 80 } };
        int maxVal = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (maxVal < arr2[i][j]) {
                    maxVal = arr2[i][j];
                }
            }
        }
        System.out.println("Maximum value from this 2Darray is : " + maxVal);
        // find minimum 
        int arr3[][] = { { 1, 2, 3 }, { 21, 15, 80 } };
        int minVal = arr3[0][0];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (minVal > arr3[i][j]) {
                    minVal = arr3[i][j];
                }
            }
        }
        System.out.println("Minimum value from this 2Darray is : " + minVal);
    }

}
