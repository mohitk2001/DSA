import java.util.Scanner;
import java.util.Stack;
class Brackets{
    String data;
    Stack<Character> s=new Stack<>();
    public Brackets(String d){
        data=d;
    }
    public boolean isBalanced(){
        for(int i=0;i<data.length();i++){
          char cur=data.charAt(i);
          if(curIsbracket(cur)){
           if(isCurisOpen(cur)){
               s.push(cur);
           }
           else{
               if(s.isEmpty()){
                   return false;
               }
               else if(!isMatching(s.peek(),cur)){
                return false;
               }
               else {
                   s.pop();
               }
           }
          }
        }
        return s.isEmpty();
    }
    public boolean curIsbracket(char ch){
        return ch=='(' || ch==')' || ch=='{' || ch=='}' || ch=='[' || ch==']'; 
    }
    public boolean isMatching(char a,char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }
    public boolean isCurisOpen(char c){
       
        return '{' ==c || '('==c|| '['==c;
    }
}
public class Paranthese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Brackets br=new Brackets(sc.nextLine());
        System.out.println(br.isBalanced());
        
        sc.close();
    }
}