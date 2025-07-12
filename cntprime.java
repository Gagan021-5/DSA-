public class cntprime {

    public static void main(String[] args) {
        int n = 37;
        boolean[] primes = new boolean[n + 1];
        isPrime(n, primes);
    }

    static void isPrime(int n, boolean[] arr) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    arr[j] = true;
                }

            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                System.out.print(i +  " ");
            }
        }


    }
}
