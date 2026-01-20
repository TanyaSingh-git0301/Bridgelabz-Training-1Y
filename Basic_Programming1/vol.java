import java.util.Scanner;
class vol{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter radius : ");
int r=s.nextInt();
System.out.println("Enter height : ");
int h=s.nextInt();
double vol=3.14*r*r*h;
System.out.println("Volume of Cylinder : "+vol);
}
}