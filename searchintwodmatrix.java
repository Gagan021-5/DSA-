import java.util.*;

// The frequency of an element is the number of times it occurs in an array.

// You are given an integer array nums and an integer k. 
// In one operation, you can choose an index of nums and increment the element at that index by 1.

// Return the maximum possible frequency of an element after performing at most k operations.

// Example 1:

// Input: nums = [1,2,4], k = 5
// Output: 3
// Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
// 4 has a frequency of 3.

public class searchintwodmatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length < 1 || matrix == null || matrix[0].length < 1)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {

            if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }

        }

        return true;
    }
}
