import java.util.Scanner;
class Triangle{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base in cm : ");
int b=s.nextInt();
System.out.println("Enter the height in cm : ");
int h=s.nextInt();
double t=0.5*b*h;
double k=t*0.155;
System.out.println("The area of tringle in square cm is "+t +" " +"and in square inches is "+k);
}
}
