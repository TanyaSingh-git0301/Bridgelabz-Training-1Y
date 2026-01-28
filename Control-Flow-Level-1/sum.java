import java.util.Scanner;
class sum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the vaule :");
int n=s.nextInt();
int sum=0;
while(n!=0){
	sum=sum+n;
    n=s.nextInt();
    
}
System.out.println(sum);
}
}