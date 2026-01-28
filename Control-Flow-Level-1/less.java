import java.util.Scanner;
class less{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number 1 : ");
int num1=s.nextInt();
System.out.println("Enter number 2 : ");
int num2=s.nextInt();
System.out.println("Enter number 3 : ");
int num3=s.nextInt();
if(num1<num2 && num1<num3)
{
System.out.println("Number 1 is the smallest");
}
else if(num2<num1 && num2<num3){
System.out.println("Number 2 is the smallest");
}
else{
System.out.println("Number 3 is the smallest");
}
}
}
