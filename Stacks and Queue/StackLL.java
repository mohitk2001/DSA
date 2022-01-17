import java.util.Scanner;


public class StackLL {
    Node top;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int n){
        Node newNode=new Node(n);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println(top.data);
        top=top.next;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackLL stack=new StackLL();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        sc.close();
    }
}
