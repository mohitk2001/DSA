import java.util.Scanner;
public class MergeTwoSortedList {
    NodeList head1,head2;
     static class NodeList{
         int  data;
         NodeList next;
         public NodeList(int d){
            data=d;
            next=null;
         }
    }
    public void Insert1(int value){
        NodeList newNode=new NodeList(value);
        if(head1==null){
            head1=newNode;
            return ;
        }
        newNode.next=null;
        NodeList cur=head1;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }
    public void Insert2(int value){
        NodeList newNode=new NodeList(value);
        if(head2==null){
            head2=newNode;
            return ;
        }
        newNode.next=null;
        NodeList cur=head2;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }
    public void printLL1(){
        NodeList cur=head1;
        while(cur!=null){
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
        System.out.println();;
    }
    public void printLL2(){
        NodeList cur=head2;
        while(cur!=null){
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        MergeTwoSortedList ll=new MergeTwoSortedList();
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        for(int i=0;i<size1;i++){
            ll.Insert1(sc.nextInt());
        }
        for(int i=0;i<size2;i++){
            ll.Insert2(sc.nextInt());
        }
        ll.printLL1();
        ll.printLL2();
       

        sc.close();
    }
}
