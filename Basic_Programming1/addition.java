import java.util.Scanner;
class addition{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
	int a=s.nextInt();
	System.out.println("Enter 2nd number : ");
	int b=s.nextInt();
    int c=a+b;
System.out.println("Sum is : "+c);
}
}