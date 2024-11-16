public class Tools{
      public static void reverse(String s1){
	 
         String s2="";
         int len1=s1.length();
         for(int i=0;i<len1;i++){
            s2=s2+s1.charAt(len1-1-i);
         }
         System.out.println(s2);
    }
}