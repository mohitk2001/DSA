public class StringDoubt {
    
        public static void main(String args[]) {
        String str="a2b3c2de";
        int count=1;
        for(int i=0;i<str.length();i++){
           if(i+1<str.length()){
               if(str.charAt(i+1)>=48 && str.charAt(i+1)<=57){
               count=Character.getNumericValue(str.charAt(i+1));
           }
           }
           System.out.println(count);
            
        }
        }
   
}
