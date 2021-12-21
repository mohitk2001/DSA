import java.util.*;
class Student {
    int scholar;
    String name ;
    int marks;
}
class studentD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudent=sc.nextInt();
        Student []st=new Student[numberOfStudent];
        Student copy=new Student();
        for(int i=0;i<st.length;i++){
            st[i]=new Student();
            st[i].scholar=sc.nextInt();
            st[i].name=sc.next();
            
            st[i].marks=sc.nextInt();
        }
        for(int i=0;i<st.length;i++){
            if(i<st.length-1 && st[i].marks>st[i+1].marks){
                copy=st[i+1];
                st[i+1]=st[i];
                st[i]=copy;
            }
        
        }
        for (int index = 0; index < st.length; index++) {
            System.out.println(st[index].scholar +" "+st[index].name+" "+st[index].marks );
        }
    }
}