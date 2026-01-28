import java.util.Scanner;
class grefacfor{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int div=0;
for(int i=num-1;i>=1;i--){
    if(num%i==0){
	div=i;
    break;
}
}
System.out.println(+div +" is the greatest factor of " +num);
}
}