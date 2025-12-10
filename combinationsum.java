import java.util.*;

/// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]

// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple
// times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.

// Example 2:
// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]

// Example 3:
// Input: candidates = [2], target = 1
// Output: []
public class combinationsum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(candidates, 0, target, new ArrayList<>(), ans);
        return ans;

    }

    public static void helper(int[] arr, int index, int target, List<Integer> curr, List<List<Integer>> res) {
        if (index == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(curr));

            }
            return;

        }
        if (arr[index] <= target) {

            curr.add(arr[index]);
            helper(arr, index, target - arr[index], curr, res); // 1,2,3
            curr.remove(curr.size() - 1); // backtrack
        }
        helper(arr, index + 1, target, curr, res);

    }

}
