public class setmatrixzero {

    public static void main(String[] args) {}

    public void setZeroes(int[][] matrix) {
        boolean fr = false;
        boolean fc = false;

        // check for specific col or row to be 0.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[0][j] == 0) {
                    fr = true;
                    break;
                }
                if (matrix[i][0] == 0) {
                    fc = true;
                    break;
                }

            }

        }

        // make it zero
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[j].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }

            if (fc) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

}
