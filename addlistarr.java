public class addlistarr {

    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<Integer> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int low = j + 1;
                    int high = nums.length - 1;
                    while (low <= high) {
                        int sum = nums[i] + nums[j] + nums[low] + nums[high];
                        if (sum == target) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                            low++;
                            high--;
                        } else if (target > sum) {
                            low++;
                        } else {
                            high--;
                        }
                    }
                }
            }
            return new ArrayList<>(ans);
        }
    }
}
