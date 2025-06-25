public class leetcodemerge {

    public static void main(String[] args) {
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            int[] mix = new int[nums1.length + nums2.length];
            while (nums1[i] < nums2[j]) {
                mix[k] = nums1[i];
                i++;
                k++;
            }

        }
    }

}
