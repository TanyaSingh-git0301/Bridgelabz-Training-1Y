import java.util.Scanner;
class BreakSum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the vaule :");
int n=s.nextInt();
int sum=0;
while(n==n){
if(n<=0){
break;}
	sum=sum+n;
    n=s.nextInt();
    
}
System.out.println(sum);
}
}