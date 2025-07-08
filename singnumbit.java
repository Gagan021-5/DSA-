public class singnumbit {

    public int singleNumber(int[] nums) {
        int result = theans(nums);
        return result;
    }

    static int theans(int[] arr) {
        int exactlyone = 0;
        for (int num : arr) {
            exactlyone ^= num;
        }
        return exactlyone;
    }
}
