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

        int result = helper(coins, amount);
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;

    }

    public static int helper(int[] arr, int target) {
        int n = arr.length;
        if (target == 0) {
            return 0;

        }

        if (target < 0) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ans = helper(arr, target - arr[i]);
            if (ans != Integer.MAX_VALUE) {
                ans = Math.min(min, 1 + ans);
            }
        }

        return min;

    }

}