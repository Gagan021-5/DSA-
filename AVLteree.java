class BST {
    private Node root;

    private class Node {
        private int value;
        private Node left, right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.value) {
            node.left = insert(val, node.left);
        } else {
            node.right = insert(val, node.right);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    private int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;

        int balanceFactor = Math.abs(height(node.left) - height(node.right));
        return balanceFactor <= 1 && balanced(node.left) && balanced(node.right);
    }
    private Node rotate(Node node){
        if(height(node.left) - height(node.right)  > 1){
            //rotate to right since left is heavy
        } 

    }

}

public class AVLteree {
    public static void main(String[] args) {

    }
}
