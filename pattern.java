public class pattern {
    public static void main(String[] args) {
        pattern1(4, 0);
    }

    static void pattern1(int r, int c) { // square shape
        if (r == 0) {
            return;
        }
        if (r > c) {

            pattern1(r, c + 1);
        } else {
            pattern1(r - 1, c);

            System.out.println();
        }
    }
}
