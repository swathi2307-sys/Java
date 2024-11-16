import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class S7{
    
    public static void main(String args[])throws IOException{
         Tools t1=new Tools();
         File f1=new File("names.txt");
         Scanner sc1=new Scanner(f1);
         String line="";
         while(sc1.hasNext()){
             line=sc1.nextLine();
             t1.reverse(line);
         }
   }
}