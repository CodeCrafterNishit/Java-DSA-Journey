public class FindLargest {
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element : " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 58, 4, 21, 45 };
        int largest = getLargest(arr);
        System.out.println("Largest element : " + largest);
    }
}
