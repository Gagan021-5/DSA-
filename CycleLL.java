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

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(Node head) {
        Node slw = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slw = slw.next;
            if (fast == slw) {
                return true;
            }
        }
        return false;
    }

    // length of cycle
    public int lengthofCycle(Node head) {
        Node slw = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slw = slw.next;
            if (fast == slw) {
                Node temp = slw;
                int cnt = 0;
                while (temp != slw) {
                    temp = temp.next;
                    cnt++;

                }
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length =0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast ==slow){
                length = lengthofCycle(slow);
                break;
            }

           
        }
        ListNode f = head;
        ListNode s = head;
        while(length>0){                               //this will give K 
             slow = slow.next;
              length--;
        }
        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return s;
       
    
    }
}

public class CycleLL {

    public static void main(String[] args) {

    }
}
