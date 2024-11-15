import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int i,n,c=0;
System.out.println("Enter a number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
System.out.println(+n+" is prime");
else
System.out.println(+n+" is  not prime");
}
}
