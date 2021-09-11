package interview.bst;

public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public BST(int key) {
        this.root = new Node(key);
        this.root.left = null;
        this.root.right = null;
    }

    public void put(int key) {
        if (this.root == null) {
           this.root = new Node(key);
        } else {
            putHelper(this.root, key);
        }
    }

    private void putHelper(Node root, int key) {
        if (root.key > key) {
            if (root.left == null) {
                root.left = new Node(key);
            } else {
                putHelper(root.left, key);
            }
        } else {
            if (root.key < key) {
                if (root.right == null) {
                    root.right = new Node(key);
                } else {
                    putHelper(root.right, key);
                }
            }
        }
    }
    public Node search(int key) {
        return searchHelper(this.root, key);
    }


    // search
    private Node searchHelper(Node root, int key) {
        // base case
        if (root == null || root.key == key) {
            return root;

        // key is on left
        } else if (key < root.key) {
            return searchHelper(root.left, key);
        } else {
            return searchHelper(root.right, key);
        }
    }


    // prints each element of the tree in order
    public void inOrder() {
        inOrder(this.root);
        System.out.println();
    }

    // recursive helper method for inOrder()
    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.printf("%s ", root.key);
        inOrder(root.right);
    }

    // non -recursive next() method return a Iterator for inorder traversal (use a stack)
//    public Iterator<interview.bst.Node> next() {
//        Iterator<interview.bst.Node> itr = new Iterator<interview.bst.Node>();
//
//    }
}
