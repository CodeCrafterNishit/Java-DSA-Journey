package ARRAY_PROBLEM_SOLVING;

public class avg_array {
    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int size = arr.length;
        double avg = (double) sum / size;
        return avg;
    }

    public static int[] mulBy10(int[] arr) {
        int size = arr.length;
        int newArr[] = new int[size]; // defining new array and its size
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement; // storing new converted elements into the newArr ith element
        }
        return newArr;
    }

    public static Boolean LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int getMax(int arr[]) {
        int max = arr[0]; // considering that i have atleast one element in my array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] PosNegSum(int arr[]) {
        int posSum = 0;
        int negSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum += arr[i];
            } else {
                negSum += arr[i];
            }
        }
        int ans[] = { posSum, negSum };
        return ans;
    }

    public static int[] ZeroOnesCount(int arr[]) {
        int ZeroCount = 0;
        int OnesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ZeroCount++;
            } else {
                OnesCount++;
            }
        }
        int Count[] = { ZeroCount, OnesCount };
        return Count;
    }

    public static void main(String[] args) {
        int[] arr = { 8, -1, 2, -4, 5 };
        int [] arr1 = {0,0,1,0,1,1,1};
        System.out.println(getAvg(arr));
        int ans[] = mulBy10(arr);
        System.out.println("Printing ans array:");
        for (int i : ans) {
            System.out.println(i);
        }
        Boolean SearchElement = LinearSearch(arr, 12);
        System.out.println(SearchElement);
        int getMaximum = getMax(arr);
        System.out.println(getMaximum);
        int PosNegSum[] = PosNegSum(arr);
        System.out.println("Positive sum = " + PosNegSum[0]);
        System.out.println("Negative sum = " + PosNegSum[1]);
        int CountAns[] = ZeroOnesCount(arr1);
        System.out.println("Zero count = " + CountAns[0]); 
        System.out.println("Ones Count = " + CountAns[1]);
    }
}
