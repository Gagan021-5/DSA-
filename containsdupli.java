import java.util.*;
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.
public class containsdupli {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hset.add(nums[i]);

           if(hset.add(nums[i])){
            return true;
           }
        }

        return false;
    }

}
