package Arrays;
public class HW1 {
    public static Boolean CheckOccurence(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1,4,7,1,4,1  };
        System.out.println(CheckOccurence(nums));
    }
}

//tc-->O(n2) 
//more of like comparison thats why used nested loops to compare elements