import java.util.*;

public class arrayissortedandrotated {
    public static void main(String[] args) {

    }

    public static boolean check(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
            }
        }

        if (nums[nums.length - 1] > nums[0]) {
            cnt++;
        }

        return cnt == 1; // for 1 possible pair
    }
}
