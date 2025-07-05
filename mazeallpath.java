public class mazeallpath {

    public static void main(String[] args) {

    }

    static void pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1 && c > 1) {
            pathDiagonal(p + 'D', r - 1, c - 1);
        }

        if (r > 1) {
            pathDiagonal(p + 'V', r - 1, c);
        }
        if (r > 0) {

            pathDiagonal(p + 'H', r - 1, c);
        }
        if (r > 0) {

            pathDiagonal(p + 'H', r - 1, c);
        }

    }

}
