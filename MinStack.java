import java.util.Stack;

// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:
// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

// Example 1:

// Input
// ["MinStack","push","push","push","getMin","pop","top","getMin"]
// [[],[-2],[0],[-3],[],[],[],[]]

// Output
// [null,null,null,null,-3,null,0,-2]

// Explanation
// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin(); // return -3
// minStack.pop();
// minSack.top();    // return 0
// minStack.getMin(); // return -2
public class MinStack {
    private Stack<Integer> mystack;
    private int top = -1;

    public MinStack() {
        mystack = new Stack<>();
    }

    public boolean isFull() {
        return top == mystack.size();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int val) {
        if (isFull())
            return;
        top++;
        mystack.push(val);
    }

    public void pop() {
        if (isEmpty())
            return;
        mystack.pop();
        top--;
    }

    public int top() {
        return mystack.peek();
    }

    public int getMin() {
        if (isEmpty())
            return -1;
        int temp = 0;
        for (int ptr2 = 0; ptr2 < mystack.size(); ptr2++) {
            while (ptr2 != mystack.size() - 1) {
                top++;
                ptr2++;
                if (mystack.elementAt(top) < mystack.elementAt(ptr2)
                        || mystack.elementAt(top) > mystack.elementAt(ptr2)) {
                    temp = Math.min(top, ptr2);
                }
            }
        }
        return temp;

    }
}
