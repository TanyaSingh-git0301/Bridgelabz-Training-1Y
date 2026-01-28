import java.util.Scanner;
class facwhile{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int i=1;
while(i<=num){
if(num%i==0){
System.out.println(+i +" is the factor of " +num);}
i++;
}
}
}