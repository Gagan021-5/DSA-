import java.util.*;

public class coinchange {

    // You are given an integer array coins representing coins of different
    // denominations and an integer amount representing a total amount of money.

    // Return the fewest number of coins that you need to make up that amount. If
    // that amount of money cannot be made up by any combination of the coins,
    // return -1.

    // You may assume that you have an infinite number of each kind of coin.

    // Example 1:

    // Input: coins = [1,2,5], amount = 11
    // Output: 3
    // Explanation: 11 = 5 + 5 + 1
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        int ans = coinChange(arr, 11);
        System.out.println(ans);
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[coins.length + 1];
        Arrays.fill(dp, -1);
        int res = helper(coins, amount, dp);
        if (res == Integer.MAX_VALUE) { // because the coins having infinite no of combinations
            return -1;
        }

    }

    public static int helper(int[] arr, int target, int[] dp) {
        int n = arr.length;
        if (target == 0) {
            return 0;
        }
        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[n] != -1) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ans = helper(arr, target - arr[i], dp);
            if (ans != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + ans);
            }
        }
        dp[target] = min;

        return min;

    }
}