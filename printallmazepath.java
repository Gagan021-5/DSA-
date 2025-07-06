public class printallmazepath {

    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r + 1 < maze.length) {
            allPath(p + 'D', maze, r + 1, c);
        }

        if (c + 1 < maze[0].length) {
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r - 1 >= 0) {
            allPath(p + 'U', maze, r - 1, c);
        }

        if (c - 1 >= 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        // Unmark the cell (backtrack)
        maze[r][c] = true;
    }
}
