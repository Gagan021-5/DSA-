import java.util.*;

class Tree {

    public Tree() {

    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
        private Node root;
        public void populate(Scanner sc) {
            System.out.println("Enter the root Node:");
            int value = sc.nextInt();
            root = new Node(val);
            populate(sc, root);
        }

        private void populate(Scanner sc, Node node) {
            System.out.println("Do you want  to enter left of " + node.val);
            boolean left = sc.nextBoolean();
            if (left) {
                System.out.println("Enter the value of left node:" + node.val);
                node.left = new Node(val);
                populate(sc, node.left);

            }
            System.out.println("Do you want  to enter right of " + node.val);
            boolean right = sc.nextBoolean();
            if (right) {
                System.out.println("Enter the value of left node:" + node.val);
                node.right = new Node(val);
                populate(sc, node.right);
            }
        }
       public void  display(){
        display(root," ");
       }

       private display(Node node,String indent){
           if(node==null){
               return;
           }
           System.out.println(indent + node.val);
           display(node.left ,indent  + "\t");
           
   
       }
    }
}

public class Trees {
    public static void main(String[] args) {

    }
}
