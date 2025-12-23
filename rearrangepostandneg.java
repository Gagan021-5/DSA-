public class rearrangepostandneg {
    public static void main(String[] args) {
        
    }


      public static int[] rearrangeArray(int[] nums) {
        if (nums.length == 1 || nums.length == 0)
            return nums;
        int prev = 0; // even
        int curr = 1; // odd
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
              if(nums[i] < 0){
                ans[curr] = nums[i];
                curr +=2;
              }
              if(nums[i] > 0){
                ans[prev] = nums[i];
                prev +=2;
              }
        }

        return ans;

    }
}
