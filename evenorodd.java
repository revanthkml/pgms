import java.util.Scanner;
public class evenorodd
{
public static void main(String args[])
{
System.out.println("Enter a number to check");
Scanner f=new Scanner(System.in);
int x=f.nextInt();
if((x&1)==0)
{
System.out.println("the number"+x+"is even");
}
else
{
System.out.println("the number"+x+"is odd");
}
}
}
