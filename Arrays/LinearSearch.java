package Arrays;
public class LinearSearch {
    public static int Linear_Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int Linear_Search_ForMenu(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 54, 8, 9, 70 };
        int key = 70;
        String menu[] = { "Samosa", "popcorn", "vadapav", "dosa" };
        String item = "dosa";
        int index = Linear_Search(arr, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index : " + index);
        }
        int index1 = Linear_Search_ForMenu(menu, item);
        if (index1 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index : " + index1);
        }
    }
}
