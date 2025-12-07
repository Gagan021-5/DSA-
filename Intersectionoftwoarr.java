import java.util.*;

public class Intersectionoftwoarr {

    // Given two integer arrays nums1 and nums2, return an array of their
    // intersection.
    // Each element in the result must appear as many times as it.
    // shows in both arrays and you may return the result in any order.

    // Example 1:
    // Input: nums1 = [1,2,2,1], nums2 = [2,2]
    // Output: [2,2]
    public static void main(String[] args) {

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int n : nums1) {
            hmap.put(n, hmap.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();

        for (int nums : nums2) {
            if (hmap.containsKey(nums) && hmap.get(nums) > 0) {
                res.add(nums);
                hmap.put(nums,hmap.get(nums-1));
            }
        }

        int[] ans = new int[res.size()];
        for (int index = 0; index < res.size(); index++) {
             ans[index] = res.get(index); 
        }

        return ans;

    }

}
