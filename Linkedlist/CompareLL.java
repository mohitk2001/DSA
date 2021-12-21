import java.util.Scanner;

public class CompareLL {
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
            System.out.print(" "+m.data+" "+ m.next+" ");
           // System.out.print(m.data);
            m=m.next;
        }
        System.out.println();
    }
    public boolean Compare(CompareLL ll1,CompareLL ll2){
        Node temp1=ll1.head;
        Node temp2=ll2.head;
        boolean isEqual=false;
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                isEqual=false;
                return isEqual;
            }
            else if(temp1.data==temp2.data){
                isEqual=true;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return isEqual;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CompareLL ll1=new CompareLL();
        CompareLL ll2=new CompareLL();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            ll1.Insert(sc.nextInt());
        }
        for(int i=0;i<size;i++){
            ll2.Insert(sc.nextInt());
        }
        // ll1.printLL();
        // ll2.printLL();
        System.out.print(ll1.Compare(ll1,ll2));
        sc.close();
    }
}
