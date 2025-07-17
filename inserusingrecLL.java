class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    
    public void inserRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp; 
        }
        
        node.next = insertRec(val, index - 1, node.next);
        return node; 
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
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

public class inserusingrecLL {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(6);
        list.display();

        
        list.inserRec(4, 2); 
        list.display(); 
    }
}
