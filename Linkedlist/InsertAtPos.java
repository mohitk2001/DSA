import java.util.Scanner;

/**
 * InsertAtPos
 */
public class InsertAtPos {
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
    public void printVV(){
        Node n=headNode;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }

    }
    public void InsertAt(int v,int p){
        Node temp=headNode;
        Node newNode=new Node(v);
        if(p==0){
           headNode=newNode;
           headNode.next=temp;
            return;
        }
        for(int i=0;i<p-1;i++){
            
            //System.out.print(temp.data+" ");
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        InsertAtPos ll=new InsertAtPos();
        for(int i=0;i<size;i++){
            ll.Insert(sc.nextInt());
        }
        ll.printVV();
        int value =sc.nextInt();
        int pos=sc.nextInt();
        ll.InsertAt(value,pos);
        ll.printVV();
        sc.close();
    }
}
