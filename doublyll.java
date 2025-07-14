class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertindb(int a) {
        Node newnode = new Node(a);
        newnode.next = head;
        newnode.prev = null;
        if (head != null)
            head.prev = newnode;

        head = newnode;
    }

    public void insertlast(int a) {
        Node node = new Node(a);
        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    public Node find(int a) {
        Node node = head;
        while (node != null) {
            if (node.val == a)
                return node;
            node = node.next;
        }
        return null;
    }

    public void insertatpos(int a,int value) {
        Node node = new Node(a);
        Node p = find(a);
        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
         node.next.prev = node;
        }

    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        // System.out.println("Printing in reverse");
        // while(last !=null){
        // System.out.print(last.val + " <- ");
        // last = last.prev;
        // }
        // System.out.println();
    }
}

public class doublyll {

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertindb(1);
        list.insertindb(2);
        list.insertindb(3);
        list.insertindb(4);
        list.insertindb(5);
        list.display();
        list.insertlast(101);
        
        System.out.println("After insertion at specific pos ");
        list.insertatpos(4,89);
        list.display();

    }

}
