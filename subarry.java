public class subarry {

    // Given an integer array nums, find a subarray that has the largest product,
    // and return the product.
    // Example 1:
    // Input: nums = [2,3,-2,4]
    // Output: 6
    // Explanation: [2,3] has the largest product 6.

    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        int mid = s + (e - s) / 2;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = s; i <= mid; i++) {
            left[i] = left[i] * left[i + 1];
        }
        for (int i = mid + 1; i <= e; i++) {
            right[i] = right[i] * right[i + 1];
        }
        for (int k = 0; k < nums.length; k++) {
            if (left[k] < right[k]) {
                return right[k];
            } else {
                return left[k];
            }

        }
        return -1;
    }

}
