import java.util.Scanner;

public class InsertAtBeg {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }
    public void pushData(int new_data){
        Node new_Node=new Node(new_data);
        new_Node.next=head;
        head=new_Node;
    }
    public void printLL(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertAtBeg ll=new InsertAtBeg();
        ll.head=new Node(1);
        Node sec=new Node(2);
        Node third=new Node(3);
        ll.head.next=sec;
        sec.next=third;
        ll.printLL();
        ll.pushData(sc.nextInt());
        ll.printLL();
        sc.close();
    }
}
