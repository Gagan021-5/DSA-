import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: nums = [4,3,2,7,8,2,3,1] nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

public class disappearednum {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> list = findDisappearedNumbers(nums);

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i < nums.length && i > 0) {

            int corr = nums[i] - 1;

            if (nums[i] < nums.length && nums[i] != nums[corr]) {
                Arrays.sort(nums);
            } else {
                i++;
            }

        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] != a + 1)
                ;
            list.add(a + 1);

        }
        return list;

    }

}
