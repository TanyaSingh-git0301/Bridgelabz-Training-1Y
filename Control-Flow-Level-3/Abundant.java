import java.util.Scanner;
class Abundant{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter numbre :");
int num=s.nextInt();
int sum=0;
for(int i=1;i<num;i++){
if(num%i==0){
sum=sum+i;
}}
if(sum>num){
System.out.println("Abundant Number");
}
else{
System.out.println("Not an Abundant Number");
}
}
}