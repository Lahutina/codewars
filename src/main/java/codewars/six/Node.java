package codewars.six;


public class Node {
    public final int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node build(int... a) {
        Node head = new Node(a[0]);
        Node prev = head;

        for (int i = 1; i < a.length; i++) {
            Node curr = new Node(a[i]);
            prev.next = curr;
            prev = curr;
        }
        return head;
    }
}

