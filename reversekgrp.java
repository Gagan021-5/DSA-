class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseList() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev; // update the head of the list to the new front
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

public class reversekgrp {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(0);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);

        System.out.print("Original List: ");
        list.display();

        list.reverseList();
        System.out.print("Reversed List: ");
        list.display();
    }
}
