package mypackage;

public class Customstack {

    private int[] data;
    private static final int size = 10;
    int top = -1;

    public Customstack(){
        this(size);
    }

    public Customstack(int s) {
        this.data = new int[s];

    }

    public boolean push(int val) { // push in array
        top++;
        data[top] = val;
        return true;
    }

    public boolean isfull() {
        return top == data.length - 1;

    }

    public boolean isempty() {
        return top == -1;

    }

    public int pop() throws StackException {
        if (isempty()) {
            throw new StackException("Cannot pop!");
        }
        int removed = data[top];
        top--;
        return removed;
    }

    public int peak() throws StackException {
        if (isempty()) {
            throw new StackException("Cannot pop!");
        }
        return data[top];
    }

}