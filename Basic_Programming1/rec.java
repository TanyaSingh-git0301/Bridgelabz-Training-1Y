import java.util.Scanner;
class rec{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Length : ");
Float l=s.nextFloat();
System.out.println("Enter Width : ");
Float w=s.nextFloat();
Float p=2*(l+w);
System.out.println("Perimeter of Rectangle : "+p);
}
}

