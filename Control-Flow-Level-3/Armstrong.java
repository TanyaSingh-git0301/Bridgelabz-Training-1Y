import java.util.Scanner;
class Armstrong{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();//153
int sum=0;
int temp=num;
while(temp!=0){
int digit=temp%10;//3 //5
sum+=digit*digit*digit;//3*3*3=27 //5*5*5=125
temp=temp/10;//15 //1
}
if(sum==num){
System.out.println("Armstrong Number");
}
else{
System.out.println("Not an Armstrong Number");
}
}
}
