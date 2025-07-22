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

    }
    



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}



public class sortedLL {
    

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(6);
        list.insertfirst(8);
        list.display();
    }
}
