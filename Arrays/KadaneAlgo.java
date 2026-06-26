package Arrays;
public class KadaneAlgo {
    public static void Kadanes(int arr[]) {
        boolean isNegative = true;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                isNegative = false;
            }
            largest = Math.max(largest, arr[i]);
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if(isNegative){
            System.out.println("max sum = " + largest);
        }else{
        System.out.println("max sum = " + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,-1,-5,-3};
        Kadanes(arr);
    }
}
