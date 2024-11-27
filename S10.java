import java.io.IOException;
public class S10{
    public static void main(String args[])throws IOException{
        Tools2 t2 = new Tools2();
        String result="";
        result=t2.reverse("abcdef");
        System.out.println(result);
        t2.reverse2("names2.txt","names2_output.txt");
        }
}