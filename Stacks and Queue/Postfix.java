import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(cur=='('){
                stack.push(cur);
            }
            else if(cur==')'){
                while(stack.peek()!='('){
                    ans=ans+stack.pop();
                }
                stack.pop();
            }
        }
        sc.close();
    }
}
