import java.util.*;

public class removeduplicatefromsortarr {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int ans = removeDuplicates(arr);
        System.out.println("Total unique is : "+ ans);
    }

    // Input: nums = [1,1,2]
    // Output: 2, nums = [1,2,_]
    // Explanation: Your function should return k = 2, with the first two elements
    // of nums being 1 and 2 respectively.
    // It does not matter what you leave beyond the returned k (hence they are
    // underscores).
 
    public static int removeDuplicates(int[] nums) {
        if(nums.length ==0) return -1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
               i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }
}
