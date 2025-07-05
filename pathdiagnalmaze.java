public class pathdiagnalmaze {

    public static void main(String[] args) {
        pathDiagonal("", 3, 3);
    }

    static void pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1 && c>1){
            pathDiagonal(p+'D', r-1, c-1);
        }

        if (r > 1) {
            pathDiagonal(p +'V', r - 1, c);
        }
        if (c > 1) {

            pathDiagonal(p +'H', r, c - 1);
        }

    }
}
