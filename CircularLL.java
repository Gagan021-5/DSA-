class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = head;
        this.tail = tail;
    }

    public void insertfirst(int val) { // insert at first
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;

    }

    // public int deleteFirst() {
    // int value = head.val;
    // head = head.next;
    // if (head == null) {
    // tail = null;
    // }
    // size--;
    // return value;

    // }

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
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // public int deletelast() {
    // if (size <= 1) {
    // return deleteFirst();
    // }
    // Node seclast = get(size - 2);
    // int val = tail.val;
    // tail = seclast;
    // tail.next = null;
    // return val;
    // }

    // public int deletefrompos(int index) {
    // if (index == 0) {
    // return deleteFirst();
    // }
    // if (index == size - 1) {
    // return deletelast();
    // }
    // Node p = get(index - 1);
    // int value = p.next.val;
    // p.next = p.next.next;
    // return value;

    // }

    public void deletenode(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
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

public class CircularLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertfirst(1);
        list.insertfirst(3);
        list.insertfirst(67);
        list.insertfirst(35);
        list.insertfirst(56);
        list.display();
        System.out.println("/n");
        System.out.println("After deletion :");
        list.deletenode(67);
        list.display();

    }

}
