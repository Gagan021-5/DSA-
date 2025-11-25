import java.util.*;

//You are a professional robber planning to rob houses along a street. 
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Example 1:
// Input: nums = [1,2,3,1]
// Output: 4

// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
public class houserobber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int ans = rob(arr);
        return ans;
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int res = maxrobbery(nums, n, dp);

        return res;
    }

    public static int maxrobbery(int[] house, int n, int[] dp) {
        if (n == 0) {
            return house[0];
        }
        if (n == 1) {
            return house[1];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = dp[n] + dp[n - 1];
        return dp[n];

    }

}
