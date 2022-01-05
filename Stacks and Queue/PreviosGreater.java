import java.util.Scanner;
import java.util.*;
public class PreviosGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int answer[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                answer[i]=-1;
            }
            else{
                answer[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++)
        System.out.print(answer[i]+" ");
        sc.close();
    }
}
