import java.util.Scanner;

/**
 * Implementation
 */
public class Implementation {
   static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
        int search=sc.nextInt();
        System.out.println("Searching your data");
        boolean isBool=Searching(root,search);
        System.out.print(isBool);
    }
    static Node createTree() {
        Node root =null;
        
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;

    }
    static boolean Searching(Node root,int searchEl){
        if(root==null){
            return false;
        }
        //Left 
        if(root.data==searchEl){
            return true;
        }
        if(Searching(root.left, searchEl)){
            return true;
        }
        if(Searching(root.right, searchEl)){
            return true;
        }
        return false;
        
    }
   
}
class Node {
    Node right;
    int data;
    Node left;
    public Node(int data){
        this.data=data;

    }
}