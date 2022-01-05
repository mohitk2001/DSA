import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Solution {
    public static int evaluateRPN(ArrayList<String> A) {
        /* write your solution here */
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<A.size();i++){
            if(!isOperator(A.get(i).charAt(0))){
                stack.push(Integer.parseInt(A.get(i)));
            }
            else{
                int second_op=stack.pop();
                int first_op=stack.pop();
                char operator=A.get(i).charAt(0);
                switch(operator){
                    case '+':stack.push(first_op+second_op);break;
                    case '-':stack.push(first_op-second_op);break;
                    case '*':stack.push(first_op*second_op);break;
                    case '/':stack.push(first_op/second_op);break;
                    default:break;
                }
            }
        }
        
        //System.out.print(stack);
        return stack.pop();
    }
    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-'|| ch=='*' || ch=='/';
    }
  }
public class PostFixexpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<String> alist=new ArrayList<String>();
       alist.add("30");alist.add("400");alist.add("*");alist.add("15");alist.add("60");alist.add("*");alist.add("+");//30 400 * 15 60 * + 
       System.out.print(Solution.evaluateRPN(alist));;
       sc.close();
    }
}
