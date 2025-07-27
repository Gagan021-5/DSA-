import java.util.Stack;

public class LargestRecHistogram {

    public static void main(String[] args) {

    }

    public int LargestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = 0;

        s.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!s.isEmpty() && heights[i] < heights[s.peek()]) {
                max = getMax(heights, s, max, i);
            }
            s.push(i);
        }
        int i = heights.length;
        while (s.isEmpty()) {
            max = getMax(heights, s, max, i);
        }

    }

    public int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area ;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }

        return Math.max(max, area);
    }
}
