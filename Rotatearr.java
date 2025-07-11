public class Rotatearr {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        swapandrev(nums, 0, nums.length - 1);   //reverse part 
        swapandrev(nums, k, nums.length-1);     //rightmost part 
        swapandrev(nums, 0, k-1);

    }

    static void swapandrev(int[] arr, int st, int en) {
        int temp = arr[en];
        arr[st] = arr[en];
        temp = arr[st];
        st++;
        en++;
    }

}
