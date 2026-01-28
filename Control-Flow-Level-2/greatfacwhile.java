import java.util.Scanner;
class greatfacwhile{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int i=num-1;
int div=0;
while(i>=1){
if(num%i==0){
	div=i;
	break;
}
i--;
}
System.out.println(+div +" is the factor of " +num);
}
}