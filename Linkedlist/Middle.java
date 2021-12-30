import java.util.Scanner;

public class Middle {

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
    public void FindMiddle(Node head){
        Node rabbit=head;
        Node turtle=head;
        while(rabbit!=null && rabbit.next!=null){
            
            rabbit=rabbit.next.next;  
            turtle=turtle.next; 
        }
        System.out.print("Middle is "+ turtle.value);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Middle ll=new Middle();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            ll.Insert(sc.nextInt());
        }
        //ll.printLL(ll.head);
        ll.FindMiddle(ll.head);
        sc.close();
    }
}
