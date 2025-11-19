public class heapsortt {

    public static void main(String[] args) {

    }

    public int[] sortArray(int[] nums) {
        int size = nums.length - 1;
        int[] ans = new int[size];
        while (size > 1) {
            swap(nums, nums[size], nums[0]);
            size--;
            heapifynow(nums, size, 0);
        }
        for (int i = size / 2; i >= 0; i++) {
            heapifynow(ans, size, i);
        }

        for (int i = 0; i <= size; i++) {
            ans[i] = nums[i];
        }

        return ans;

    }

    public static void heapifynow(int[] arr, int size, int index) {
        while (true) {
            int largest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left <= size && arr[left] > arr[largest])
                largest = left;
            if (right <= size && arr[right] > arr[largest])
                largest = right;

            if (largest != index) {
                int temp = arr[largest];
                arr[largest] = arr[index];
                arr[index] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

}
