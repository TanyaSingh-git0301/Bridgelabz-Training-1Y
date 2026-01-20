import java.util.Scanner;
class IntOp{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
    int a=s.nextInt();
	System.out.println("Enter 2nd number : ");
	int b=s.nextInt();
	System.out.println("Enter 3rd number : ");
    int c=s.nextInt();
    int d=a+b*c;
	int e=a*b+c;
	int f=c+a/b;
    int g=a%b+c;
System.out.println("The results of Int Operators are : "+d +" " +e +" " +" " +f +" " +g);
}
}