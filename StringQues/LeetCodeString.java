public class LeetCodeString {
    public static void main(String args[]) {
        String str="1.1.1.1";
        StringBuilder s=new StringBuilder(str);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                s.insert(i,'[');
                System.out.print(s.charAt(i));
            }
            
        }
        
      }
}
