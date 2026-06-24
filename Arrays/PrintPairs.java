package Arrays;
public class PrintPairs {
    public static void Pairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int currNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + currNum + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalPairs);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Pairs(arr);
    }
}
