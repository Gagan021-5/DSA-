public class BST {
    private Node root;

    // Node class
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

    // Public method to insert value
    public void insert(int value) {
        root = insert(value, root);
    }

    // Internal recursive insert
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

    // Get height of a node
    private int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    // Check if BST is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Public balanced check
    public boolean balanced() {
        return balanced(root);
    }

    // Recursive check for balance
    private boolean balanced(Node node) {
        if (node == null) return true;

        int balanceFactor = Math.abs(height(node.left) - height(node.right));
        return balanceFactor <= 1 && balanced(node.left) && balanced(node.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        System.out.println("Is tree balanced? " + tree.balanced());
    }
}
