import java.util.Scanner;

public class ReverseLL {
    Node headNode;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public void Insert(int data){
        Node box=new Node(data);
        if(headNode==null){
            headNode=box;
            return;
        }
        box.next=null;
        Node temp=headNode;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=box;
    }
    public Node  Reverse(Node head){
        //System.out.print(head+" "+head.data+" "+head.next);
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public void printLL(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseLL ll=new ReverseLL();
        int size=sc.nextInt();
        while(size-->0){
            ll.Insert(sc.nextInt());
        }
        Node s=ll.Reverse(ll.headNode);
        sc.close();
        ll.printLL(s);
    }
}
