import java.util.Scanner;

/**
 * DeleteFromEnd
 */
public class DeleteFromEnd {
    Node head;
    static class Node{
        int value;
        Node next;
        public Node(int d){
            value=d;
            next=null;
        }
    }
    public void Insert(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            return;
        }
        Node cur=head;
        new_node.next=null;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void printLL(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.value+" ");
            n=n.next;
        }
        System.out.println();
    }
    public Node reverse(Node head){
        Node cur=head;
        Node p=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=p;
            p=cur;
            cur=temp;
        }
        return p;
    }
    public Node Deletion(Node head,int pos){
        Node cur=head;
        Node temp=null;
        if(pos==1 || pos>5){
            head=cur.next;
            return head;
        }
        for(int i=0;i<pos-2;i++){
            cur=cur.next;
        }
        temp=cur.next;
        cur.next=temp.next;

        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeleteFromEnd ll=new DeleteFromEnd();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            ll.Insert(sc.nextInt());
        }
        int deletepos=sc.nextInt();
        Node head=ll.reverse(ll.head);
        ll.printLL(head);
        head=ll.Deletion(head,deletepos);
        ll.printLL(head);
        ll.printLL(ll.reverse(head));
        sc.close();
    }
}