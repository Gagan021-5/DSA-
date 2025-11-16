import java.util.*;

public class quicksort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivot = partiiton(arr, low, high);
        quicksort(arr, low, pivot - 1);
        quicksort(arr, pivot + 1, high);

    }

    public static int partiiton(int[] arr, int low, int high) {
        int piv = arr[high];
        int i = low - 1; // index -1 for swapping up with less value

        for (int j = low; j < high; j++) {
            if (arr[j] < piv) {
                i++; // comes to valid pos
                // then swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // this will postion piv to correct pos
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

}
