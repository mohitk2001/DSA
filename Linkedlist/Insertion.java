import java.util.Scanner;

/**
 * Insertion
 */
public class Insertion {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Insertion ll=new Insertion();
        for(int i=0;i<size;i++){
            ll.Insert(sc.nextInt());
        }
        ll.printVV();
        sc.close();
    }
}