public class powerofxrec {

    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
      
        return ispow(x, n);
    }

    static double ispow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return ispow(x * x, n / 2);
        }

        return x * ispow(x * x, n / 2);
    }

}
