import java.util.*;

public class nqueen {
    public static void main(String[] args) {
        boolean[][] board = { {}, {}, {} };

    }

    static int queen(boolean[][] board, int r, int c) {
        if (r == board.length) {
            display(board);
            return 1;
        }
        
        int count = 0;
        // placing the queen
        for (int col = 0; col < board.length; col++) {
         if

        }
        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

}
