package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        double avg = (double) sum / arr.length;
        System.out.println(avg);

        int[] a = { 2, 4, 6, 7 };
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
