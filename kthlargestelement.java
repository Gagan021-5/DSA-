import java.util.*;

// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?

// Example 1:
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
public class kthlargestelement {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        int result = pq(nums, 0, nums.length - 1, k);
        return result;
    }

    // create max heap
    public int pq(int[] arr, int left, int right, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // push elements
        for (int i = 0; i < k; i++) {
            pq.add(arr[k]);
        }

        for (int i = k; k <= right; i++) {
            if (arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        int ans = pq.peek();
        return ans;
    }

}
