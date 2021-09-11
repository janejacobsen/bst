package interview.linkedlist;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.appendToTail(3);
        list.appendToTail(12);
        list.appendToTail(17);
        list.appendToTail(9);
        list.appendToTail(17);
        list.appendToTail(6);
        list.appendToTail(2);
        list.appendToTail(3);

        list.printList();
        System.out.println();

        removeDups(list);
//        removeDupsNoBuffer(list);

        list.printList();
        System.out.println();

        list.removeNode(list.getNode(17));

        list.printList();
        System.out.println();

    }


    private static void removeDups(LinkedList ll) {
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        Node curr = ll.head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    private static void removeDupsNoBuffer(LinkedList ll) {
        Node slow = ll.head;
        while (slow != null) {
            Node fast = slow;
            while(fast.next != null) {
                if (fast.next.data == slow.data) {
                    fast.next = fast.next.next;
                } else {
                    fast = fast.next;
                }
            }
            slow = slow.next;
        }
    }


}
