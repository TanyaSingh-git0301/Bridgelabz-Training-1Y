import java.util.Scanner;
class SI{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the principal : ");
float p=s.nextFloat();
System.out.println("Enter the rate : ");
float r=s.nextFloat();
System.out.println("Enter the time : ");
int t=s.nextInt();
float SimIn=(p*r*t)/100;
System.out.println("Simple Interest : "+SimIn);
}
}

