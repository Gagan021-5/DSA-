
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
    

    public void display(){
        Node temp = head;
        while(temp !=null){
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

public class insertopinLL {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertfirst(2);
       list.insertfirst(3);
       list.insertfirst(4);
       list.insertfirst(5);
       list.insertfirst(7);
       list.display();
    }

}
