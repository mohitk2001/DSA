import java.util.Scanner;

public class DeleteNode {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    public void Insert(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void printLL(){
        Node m=head;
        while(m!=null){
            //System.out.print(m+" "+m.data+" "+ m.next+" ");
            System.out.print(m.data);
            m=m.next;
        }
        System.out.println();
    }
    public void DeleteAtpos(int pos){
        Node temp=head;
        Node p=null;
        if(pos==0){
            head=temp.next;
            return;
        }
        for(int i=0;i<pos-1;i++){
            //System.out.print(temp+" "+temp.data+" "+ temp.next+" ");
            temp=temp.next;
        }
        p=temp.next;
        temp.next=p.next;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeleteNode ll=new DeleteNode();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            ll.Insert(sc.nextInt());
        }
        ll.printLL();
        int pos =sc.nextInt();
        ll.DeleteAtpos(pos);
        ll.printLL();
        sc.close();
    }
}
