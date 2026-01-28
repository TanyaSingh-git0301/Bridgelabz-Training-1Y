import java.util.Scanner;
class multiple{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number : ");
int num=s.nextInt();
if(num>=0 && num<=100){
for(int i=100; i>=1;i--){
if(num%i==0){
System.out.println(+num +" is a multiple of "+i);}
}
}
}
}
