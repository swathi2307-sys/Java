import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class S6{
    
    public static void main(String args[])throws IOException{
         Tools t1=new Tools();
         File f1=new File("names.txt");
         Scanner sc1=new Scanner(f1);
         String line="";
         for(int i=0;i<3;i++){
          line=sc1.nextLine();
          t1.reverse(line);
         }
   }
}