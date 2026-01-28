import java.util.Scanner;
class power{
public static void main(String args[])
{
Scanner d=new Scanner(System.in);
System.out.println("Enter number : ");
int num=d.nextInt();
System.out.println("Enter power : ");
int pow=d.nextInt();
int result=1;
for(int i=1; i<=pow ;i++){
result=result*num;
}
System.out.println(+num +" to the power " +pow +" is " +result);}
}