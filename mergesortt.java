import java.util.Arrays;

public class mergesortt {

    public static void main(String[] args) {
        int[] arr = { 8, 45, 13, 32 };
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesort(int[] arr, int s, int e) {
        int m = s + (e - s) / 2;
        if (e - s <= 1)
            return;
        mergesort(arr, s, m);
        mergesort(arr, m, e);
        mergeall(arr, s, m, e);

    }

    public static void mergeall(int[] arr, int s, int m, int e) {
        int[] org = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {
                org[k] = arr[i];
                i++;
                k++;
            } else {
                org[k] = arr[j];
                j++;
                k++;
            }
        }
        // remaining elements
        while (i < m) {
            org[k] = arr[i];
            i++;
            k++;
        }
        // next remainings
        while (j < e) {
            org[k] = arr[j];
            j++;
            k++;
        }

        for (int a = 0; a < org.length; a++) {
            arr[s + a] = org[a];
        }
    }

}
