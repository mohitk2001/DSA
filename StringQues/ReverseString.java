public class ReverseString{
    public static void main(String args[]) {
        String str="Coding_Is_Great";
        String word[]=str.split("_");
        String result="";
        for(String s:word){
           String val="";
           char firstVal=s.charAt(0);
           char lastValue=s.charAt(s.length()-1);
           val=Character.toString(lastValue);
           val=val+s.substring(1,s.length()-1);
           val=val+Character.toString(firstVal);
           result=result+val+" ";
           
        }
       System.out.println(result.trim());
       }
}