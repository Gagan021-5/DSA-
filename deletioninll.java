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

    public int deleteFirst() {
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deletelast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node seclast = get(size - 2);
        int val = tail.val;
        tail = seclast;
        tail.next = null;
        return val;
    }

    public int deletefrompos(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node p = get(index - 1);
        int value = p.next.val;
        p.next = p.next.next;
        return value;

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

public class deletioninll {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(8);
        list.insertfirst(9);
        list.display();
        System.out.println("Node returned of that value :");
        list.find(8);
      
        list.display();
    }
}
