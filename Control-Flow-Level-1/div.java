import java.util.Scanner;
class div{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value : ");
int a=s.nextInt();
if(a%5==0)
{
System.out.println("Divisible by 5.");
}
else{
System.out.println("Not Divisible by 5.");
}
}
}