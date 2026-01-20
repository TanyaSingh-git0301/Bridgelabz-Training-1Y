import java.util.Scanner;
class convert{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the temp in Farenheit :");
float temp=s.nextFloat();
float tempC=(temp-32)*5/9;
System.out.println("Conversion is : "+tempC);
}
}
