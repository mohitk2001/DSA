import java.util.Scanner;

public class InsertAtEnd {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public void printLL(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    public void pushAtEnd(int newD){
        Node newNode=new Node(newD);
        if(head==null){
            head=new Node(newD);
            return ;
        }
        newNode.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
            
        }
        last.next=newNode;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertAtEnd ll=new InsertAtEnd();
        ll.head=new Node(1);
        Node sec=new Node(2);
        Node third=new Node(3);
        ll.head.next=sec;
        sec.next=third;
        ll.printLL();
        ll.pushAtEnd(sc.nextInt());
        ll.printLL();
        sc.close();
    }
}
