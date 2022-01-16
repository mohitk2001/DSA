import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int n){
        data=n;
        next=null;
    }
}
public class QueueLL {
    Node rear,front;
    
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            rear=front=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }
        int ans=front.data;
        front=front.next;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueLL queue=new QueueLL();
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        sc.close();
    }
}
