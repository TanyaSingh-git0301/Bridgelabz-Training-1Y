import java.util.Scanner;
class Profit{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Cost price : ");
int cp=s.nextInt();
System.out.println("Enter Selling price : ");
int sp=s.nextInt();
int profit=((sp-cp)/cp)*100;
System.out.println("Profit Percentage : "+profit);
}
}



