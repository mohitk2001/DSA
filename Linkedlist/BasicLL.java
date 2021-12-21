/**
 * BasicLL
 */

public class BasicLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void printLL() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " " + n.next);
            n = n.next;
        }
    }

    public void printThirdNode(Node third) {
        System.out.print(third.data);
    }

    public static void main(String[] args) {
        BasicLL ll=new BasicLL();
        ll.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        ll.head.next=second;
        second.next=third;
        ll.printLL();
        ll.printThirdNode(third);
    }
}