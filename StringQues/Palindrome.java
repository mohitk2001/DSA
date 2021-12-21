public class Palindrome {
    public static void main(String args[]) {
        String s="Mom and Dad are my best friends";
        String word[]=s.split("\\s");
        //int count=0;
        for(String w:word){
            StringBuilder strg=new StringBuilder(w);
            strg.reverse();
            if(strg.toString().equalsIgnoreCase(w)){
                System.out.println(strg + " "+w);
            }
        }
      }
}
