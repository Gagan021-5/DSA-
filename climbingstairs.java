import java.util.*;

//You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

public class climbingstairs {
    public static void main(String[] args) {
        int ans = climbStairs(3);
        System.out.println(ans);
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int res = helper(n, dp);
        return res;
    }
    
    public static int helper(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n]; // if not -1 then it will be the ans
        }

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];

    }

}