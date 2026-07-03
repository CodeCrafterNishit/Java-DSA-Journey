public class Array2D {
    public static void main(String[] args) {
        // declaration
        int[][] arr;
        // allocation
        arr = new int[3][4]; // 0-3 rows and 0-4 columns
        int arr1[][] = {
                { 1, 2, 10, 20 }, { 3, 4, 7, 14 }, { 5, 6, 15 }, { 7, 8, 100 }
        };
        System.out.println("Your 2D array has these elements:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][1]);
        // System.out.println(arr1[0][2]);
        // System.out.println(arr1[0][3]);

        //hw question to allocate memory 
        int [][]arr2 = new int[4][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[5];
        arr2[3] = new int[1];
        
        
    }
}

// what are 2d arrays --> an array of arrays
