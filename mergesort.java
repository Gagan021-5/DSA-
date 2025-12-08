import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 8 };

        Mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // merge+ merge sort
    public static void Mergesort(int[] arr, int s, int e) {
        int mid = s + (e - s) / 2;
        if (e - s <= 1)
            return;
        Mergesort(arr, s, mid ); // left ki call
        Mergesort(arr, mid, e); // right ki call
        merge(arr, s, mid, e);

    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int[] org = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] <= arr[j]) {
                org[k++] = arr[i++];
            } else {
                org[k++] = arr[j++];

            }

            
        }
        while (i < mid) {
            org[k++] = arr[i++];

        }
        while (j < e) {
            org[k++] = arr[j++];

        }
        for (int index = 0; index < org.length; index++) {
            arr[s + index] = org[index];
        }
    }
}
