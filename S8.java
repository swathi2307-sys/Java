import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class S8{
    public static void reverse2(String fname1)throws IOException{
       Tools t1=new Tools();
         File f1=new File(fname1);
         Scanner sc1=new Scanner(f1);
         String line="";
         while(sc1.hasNext()){
             line=sc1.nextLine();
             t1.reverse(line);
         }
         System.out.println();	
    }
    
    public static void main(String args[])throws IOException{
        reverse2("names.txt");
        reverse2("names2.txt");
   }
}