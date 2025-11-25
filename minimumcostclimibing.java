import java.util.*;
//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
//Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.

// Example 1:
// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.

public class minimumcostclimibing {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20 };
        int res = minCostClimbingStairs(arr);
        System.out.println(res);
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int res = Math.min(findminimum(cost, n - 1, dp), findminimum(cost, n - 2, dp));
        return res;
    }
    
    
    // with memoization
    public static int findminimum(int[] cost, int n, int[] dp) {
        if (n == 0) {
            return cost[0];
        }
        if (n == 1) {
            return cost[1];
        } 

        if(dp[n] !=-1){
            return dp[n];
        }

        dp[n] = cost[n] + Math.min(findminimum(cost, n - 2, dp), findminimum(cost, n - 1, dp));
        return dp[n];

    }

}
