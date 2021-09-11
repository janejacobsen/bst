package interview.bst;

public class Node {
    protected Node left, right;
    protected int key;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public int getKey() {
        return this.key;
    }
}