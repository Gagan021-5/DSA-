import java.util.Arrays;

public class insertionsort {

    // insertionsort
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    static void swap(int[] arr,int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}
