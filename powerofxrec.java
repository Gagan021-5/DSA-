public class powerofxrec {

    public static void main(String[] args) {
         double val =  ispow(x,n);
    }


    static double ispow(double x, (long) n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return ispow(x * x, n / 2);
        }

        return x * ispow(x * x, n / 2);
    }

}
