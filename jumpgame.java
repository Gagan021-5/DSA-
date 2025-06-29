public class jumpgame {

    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {
       int maxindval =0 ;
       for(int i=0;i<nums.length;i++){

        if(i> maxindval) return false;
        maxindval = Math.max(maxindval,i + nums[i]);
         
       }
       return true;
    }
}
