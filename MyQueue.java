import java.util.Stack;

public class MyQueue {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
    }

}

class QueueusingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public void add(int item) {
        first.push(item);

    }

    public int remove() {
        while (!first.isEmpty()) {
            second.push(first.pop()); // remove from f and push it in 2nd
        }

        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop()); // remove from f and push it in 2nd
        }

        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

}
