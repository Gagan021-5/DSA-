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
        return rotate(node);
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
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

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public int height() {
        return height(root);
    }

}

public class AVLtree {
    public static void main(String[] args) {
        BST tree = new BST();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
