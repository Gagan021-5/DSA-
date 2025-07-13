class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val) { // insert at first
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertlast(int val) { // inser at last
        Node node = new Node(val);
        if (tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertatpos(int val, int pos) { // insert at position

        if (pos == 0) {
            insertfirst(val);
            return;
        }
        if (pos == size) {
            insertlast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node posnode = new Node(val);
        posnode.next = temp.next;
        temp.next = posnode;

        size++;

    }

    public int deleteFirst() {
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}

public class inserartparticularrval {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);

        list.insertfirst(8);
        list.insertfirst(9);
        list.display();
        System.out.println("After deletetion of first element :=");
        System.out.println(list.deleteFirst());
        list.display();
    }
}
