import java.util.Scanner;
class DouOp{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
    double a=s.nextDouble();
	System.out.println("Enter 2nd number : ");
	double b=s.nextDouble();
	System.out.println("Enter 3rd number : ");
    double c=s.nextDouble();
    double d=a+b*c;
	double e=a*b+c;
	double f=c+a/b;
	double g=a%b+c;
System.out.println("The results of Int Operators are : "+d +" " +e +" " +" " +f +" " +g);
}
}