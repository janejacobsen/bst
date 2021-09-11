package interview.bst;

public class Main {
    public static void main(String[] args) {


        BST tree = new BST();
        tree.put(10);
        tree.put(5);
        tree.put(15);
        tree.put(3);
        tree.put(7);

//        tree.put(10);
//        tree.put(8);
//        tree.put(9);
//        tree.put(14);
//        tree.put(11);
//        tree.put(16);
//        tree.put(15);
//        tree.put(20);
//        tree.put(25);
//        tree.put(7);
//        tree.put(5);
//        tree.put(6);
//        tree.put(4);
//        tree.put(3);


//        tree.delete(15);

        tree.inOrder();
    }
}
