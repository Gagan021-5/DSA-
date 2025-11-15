import java.util.*;

// Given a sorted array that may contain duplicates, return the first index of the target element.
// If the target does not exist, return -1.

// Example:
// Input:
// nums = [2, 4, 4, 4, 5], target = 4
// Output:
// 1
public class firsoccurence {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 4, 4, 5 };
        int ans = firstOccwithDuplicate(nums, 4);
        System.out.println(ans);

    }

    public static int firstOccwithDuplicate(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int first = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                first = mid; // store the answer then move left to check if it is the first element of not
                e = mid - 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return first;
    }
}
