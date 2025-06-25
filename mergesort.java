import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {
        int[] arr = { 8, 45, 13, 32 };
        mergesortinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortinplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;

        mergesortinplace(arr, s, mid);
        mergesortinplace(arr, mid, e);

        mergeinplace(arr, s, mid, e); // sorting of merged values

    }

    static void mergeinplace(int[] arr, int s, int m, int e) {
        int[] both = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                both[k] = arr[i];
                i++;
            } else {
                both[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i < m) {
            both[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            both[k] = arr[j];
            j++;
            k++;
        }

        for (int val = 0; val < both.length; val++) {
            arr[s + val] = both[val];
        }

    }
}
