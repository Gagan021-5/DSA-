import java.util.*;

// 2. Find Element in a Rotated Sorted Array(Medium Difficulty)

// This teaches you to adapt binary search when the sorted order is“broken”

// Question:
// You are given a rotated sorted array,e.g.[4,5,6,7,0,1,2]
//Find the index of target.
//Return -1 if not found.
// Example:
//Input:nums=[4,5,6,7,0,1,2],target=0 
//Output:4

public class rotatedsortedarr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    }

    public static int RotatedArray(int[] arr, int target) {
        if (arr.length == 1)
            return -1;

    }

    public static int helper(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } // move to left part

            if (arr[s] <= arr[mid]) {
                if (arr[s] <= target && target <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
                // move to right part
            } else if (arr[mid] <= arr[e]) {
                if (arr[mid] <= target && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;

    }

}
