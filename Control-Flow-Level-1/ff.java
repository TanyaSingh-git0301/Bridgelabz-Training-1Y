import java.util.Scanner;
class ff{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value :");
int n=s.nextInt();
int r=1;
for(int i=1;i<=n;i++){
	r=r*i;
}
System.out.println("The factorial of is "+r);
}
}
