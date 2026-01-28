import java.util.Scanner;
class countNum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int count=0;
int temp=num;
while(num!=0){
num=num/10; 
count++;
}
System.out.println("The number of digits in "+temp +" are "+count);
}
}