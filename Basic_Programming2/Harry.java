import java.util.Scanner;
class Harry{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name :");
String name=s.nextLine();
System.out.println("Enter the Birth Year :");
int year1=s.nextInt();
System.out.println("Enter the Current Year :");
int year2=s.nextInt();
int Age=year2-year1;
System.out.println("Name is :"+name);
System.out.println("Age is :"+Age);
}
}



