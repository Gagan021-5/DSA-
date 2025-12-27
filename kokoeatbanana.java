import java.util.*;

public class kokoeatbanana {
    public static void main(String[] args) {

    }

    public int minEatingSpeed(int[] piles, int h) {
        int output = findk(piles, h);
        return output;
    }

    public static int findk(int[] arr, int target) {

        int left = 1;
        int maxright = 0;
        for (int n : arr) {
            maxright = Math.max(maxright, n);
        }

        int ans = BS(arr, left, target, maxright);
        return ans;

    }

    public static int BS(int[] arr, int left, int target, int right) {

        int res = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int speedk = 0;
            for (int pile : arr) {
                speedk += Math.ceil((double) pile / mid);
            }

            if (speedk <= target) {
                res = Math.min(res, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return res;
    }
}
