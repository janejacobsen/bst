package interview.linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void appendToTail(int data) {
        Node end = new Node(data);
        Node temp = this.head;
        if (this.head == null) {
            this.head = end;
            return;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = end;
        }

    }

    // returns null if data is not in list
    public Node getNode(int data) {
        Node curr = this.head;
        while (curr != null) {
            if (curr.data == data) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public void remove(int data) {
        Node prev = null;
        Node curr = this.head;

        if (curr != null && curr.data == data) {
            this.head = curr.next;
            return;
        }
        while (curr != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            // node to be deleted doesn't exist
            return;
        }
        prev.next = curr.next;
    }

    // returns false if n is null of if n is tail node
    public boolean removeNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

    public void printList() {
        Node temp = this.head;
        System.out.print(temp.data);
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(", " + temp.data);

        }
    }

}

