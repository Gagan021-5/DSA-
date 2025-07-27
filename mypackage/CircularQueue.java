package mypackage;

public class CircularQueue {
    private int[] data;
    private static final int size = 10;
    protected int front = 0;
    protected int end = 0;
    private int mysize = 0;

    public CircularQueue() {
        this(size);
    }

    public CircularQueue(int s) {
        this.data = new int[s];
    }

    public boolean isfull() {
        return mysize == data.length;
    }

    public boolean isempty() {
        return mysize == 0;
    }

    public boolean insertCircQueue(int val) {
        if (isfull())
            return false;

        data[end] = val;
        end = (end + 1) % data.length;
        mysize++;
        return true;
    }

    public int removecircqueue() throws Exception {
        if (isempty()) {
            throw new Exception("Empty!");
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        mysize--;
        return removed;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display() {
        if (isempty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        int count = 0;
        while (count < mysize) {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
            count++;
        }
        System.out.println("END");
    }
}
