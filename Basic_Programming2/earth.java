import java.util.Scanner;
class earth{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius in Kilometres : ");
double k=s.nextDouble();
System.out.println("Enter the radius in Miles : ");
double m=s.nextDouble();
double kvol=(4/3)*3.14*k*k*k;
double mvol=(4/3)*3.14*m*m*m;
System.out.println("The volume of earth in cubic kilometers is "+kvol +" " +"and cubic miles is "+mvol);
}
}

