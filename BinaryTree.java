class BST {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public BST(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) {
            node.left = insert(val, node.left); // recursively call the fxn

        } else {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right));

        return node;

        public boolean balanced(){
            return balanced(root);
        }

        private boolean balanced(Node node){
            if(node == null) {return true;}
        
            return Math.abs(height(node.left)- height(node.right)<=1);-
        }
     

    }



    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }

    public static void main(String[] args) {

    }
}
