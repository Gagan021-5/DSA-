import java.util.*;

// Given an integer array nums, find the contiguous subarray (containing at least one number) that has the largest sum, 
//where all elements in the array are non-positive (i.e., negative or zero).

// Example:
// Input: [-1, -2, -3, -4, -5]
// Output: -1
// Explanation: The largest sum is the element -1, as all other subarrays result in a more negative sum.

public class kadanealgo2 {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, -5 };
        System.out.println(Maxsubwithneg(arr));

    }

    public static int Maxsubwithneg(int[] arr) {
        int maxsum = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxsum = Math.max(maxsum, curr);

        }

        return maxsum;

    }
}
