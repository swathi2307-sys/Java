public class S2{
    public static void main(String args[]){
       String s1="ABCDEFG";
       String s2="";
       int len1=s1.length();
       for(int i=0;i<len1;i++){
           s2=s2+s1.charAt(len1-1-i);
       
        
       }
       System.out.println(s2);
   }
}