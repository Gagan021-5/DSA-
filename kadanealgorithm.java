import java.util.*;

public class kadanealgorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        maxSubArray(arr);

    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        // //brute Force
        // int sum = 0;
        // int max = 0;
        // for (int st = 0; st < nums.length; st++) {
        // for (int end = 0; end < nums.length; end++) {
        // sum += nums[end];
        // max = Math.max(max, sum);
        // }

        // }
        // return max;

        // Kadane's Algorithm
        int maxsum = Integer.MIN_VALUE;
        int curr = 0;
        

        for(int n : nums){
            curr += n;
            maxsum  = Math.max(maxsum, curr);
            //if -ve reset to zero
            if(curr < 0){
                curr = 0;
            }
        }

        return maxsum;

    }

}

