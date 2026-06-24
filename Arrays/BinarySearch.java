package Arrays;
public class BinarySearch {

    public static int Binary_Search(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {8, 14, 25, 97, 140};
        int key = 97;

        int searchKey = Binary_Search(arr, key);

        if (searchKey == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at index : " + searchKey);
        }
    }
}