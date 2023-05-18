package codewars.six;

/*
https://www.codewars.com/kata/5567e7d0adb11174c50000a7/train/java
 */
public class NodeMania {
    /*
    Preloaded class Node {
        public final int data; //The value at the current node
        public Node next; //The next node in the linkedList
    }
    */
    public static Integer searchKFromEnd(Node linkedList, int k) {
        int size = size(linkedList);

        if (size == 0 || k > size)
            return null;
        else {
            int elIndex = size - k;
            Node curr = linkedList;
            for (int i = 0; i < elIndex; i++) {
                curr = curr.next;
            }
            return curr.data;
        }
    }

    public static int size(Node head) {
        if (head == null)
            return 0;

        Node curr = head;
        int size = 1;

        while (curr.next != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }
}
