import java.util.Scanner;
class Sam{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Marks of Maths,Physics, Chemistry : ");
int num1=s.nextInt();
int num2=s.nextInt();
int num3=s.nextInt();
double A=(num1+num2+num3)/3;
System.out.println("Average of three numbers : "+A);
}
}