import java.util.ArrayList;
import java.util.List;

public class spiralmat {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // left-> right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            // right -> bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // rightbottom -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i++) {
                    list.add(matrix[bottom][i]);

                }
            }
            bottom--;
            // leftbottom -> top
         if(left<= right){
               for (int i = bottom; i >= top; i++) {
                list.add(matrix[i][left]);
            }
        }
        left++;

        }
        return list;
    }
}
