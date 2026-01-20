import java.util.Scanner;
class cal{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
	float a=s.nextFloat();
	System.out.println("Enter 2nd number : ");
	float b=s.nextFloat();
    float c=a+b;
	float d=a-b;
	float e=a*b;
	float f=a/b;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a +" " +"and "+b +" " +"is "+c +", " +d +", "+e +", "+f);
}
}