import java.util.*;

public class recurisvebubblesort {

    // Given an array of integers nums, sort the array in non-decreasing order using
    // the recursive Bubble Sort algorithm, and return the sorted array.

    // You must implement Bubble Sort using recursion only.
    // Do not use built-in sorting functions (sort, sorted, Arrays.sort, etc.).
    // A sorted array in non-decreasing order is an array where each element is
    // greater than or equal to the previous one.

    // Examples:
    // Input: nums = [7, 4, 1, 5, 3]

    // Output: [1, 3, 4, 5, 7]

    // Explanation: 1 <= 3 <= 4 <= 5 <= 7.

    // Thus the array is sorted in non-decreasing order.
    public static void main(String[] args) {

    }

    public static int[] bubbleSort(int[] nums) {
        int[] arr = {7,4,1,5,3};
        BubbleSort(arr, nums.length-1, 0);
        int[] sorted = Bubb
    }

    public static void BubbleSort(int[] arr, int row, int col) {
        if (row == 0)
            return;

        if (col == row) {
            BubbleSort(arr, row  - 1, 0);
            return;
        }

        if (arr[col] > arr[col + 1]) {
            swap(arr, col, col+1);
        }

        BubbleSort(arr, row, col + 1);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}
