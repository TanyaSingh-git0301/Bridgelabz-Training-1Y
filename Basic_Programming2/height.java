import java.util.Scanner;
class height{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your height in cm : ");
double i=s.nextDouble();
double h=i*0.394;
double h1=i/30.48;
System.out.println("Your Height in cm is "+i +" " +"while in feet is"+h1 +" " +"and inches is"+h );
}
}
