import java.util.Scanner;
class FeetsToYards{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the height in feets : ");
int f=s.nextInt();
double y=f/3;
double m=y/1760;
System.out.println("Your Height in feets is "+f +" " +"while in yards is "+y +" " +"and miles is "+m);
}
} 