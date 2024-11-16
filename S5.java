import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class S5{
    
    public static void main(String args[])throws IOException{
         Tools t1=new Tools();
         File f1=new File("names.txt");
         Scanner sc1=new Scanner(f1);
         String line="";
         
         line=sc1.nextLine();
         t1.reverse(line);
         
         line=sc1.nextLine();
         t1.reverse(line);
         
         line=sc1.nextLine();
         t1.reverse(line);
          
              
      
   }
}