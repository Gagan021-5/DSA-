
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
    public void display(){
        Node temp = head;
        while(temp!=null){
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

public class Linkedlist {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(3); 
        list.insertfirst(8); 
        list.insertfirst(7); 
        list.insertfirst(17);
        list.display(); 
    }
}
