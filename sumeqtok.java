import java.util.*;
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2

public class sumeqtok {
    public static void main(String[] args) {

    }

    public static int subarraySum(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
    }
}
