import java.util.Scanner;
class circle{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter radius : ");
	float radius=s.nextFloat();
    
   double area=3.14*radius*radius;
   System.out.println("Area of circle : "+area);
}
}