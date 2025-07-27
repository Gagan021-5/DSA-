import java.util.*;

public class TwoStack {

    static int TheStack(int x, int[] a, int[] b) {
        return TheStack(x, a, b, 0, 0);
    }

    private static int TheStack(int x, int[] a, int[] b, int sum, int cnt) {
        if (sum > x) {
            return cnt;
        }
        if (a.length == 0 || b.length == 0)
            return cnt;

        int ans1 = TheStack(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], cnt + 1);
        int ans2 = TheStack(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], cnt + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(TheStack(x, a, b));
        }

    }
}
