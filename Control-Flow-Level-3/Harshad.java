import java.util.Scanner;
class Harshad{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int temp=num; 
int sum=0;
while(temp!=0){
int digit=temp%10; 
sum+=digit; 
temp=temp/10; 
}
if(num%sum==0){
System.out.println("Harshad Number");
}
else{
System.out.println("Not a Harshad Number");
}
}
}