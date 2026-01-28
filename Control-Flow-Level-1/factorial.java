import java.util.Scanner;
class factorial{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value :");
int n=s.nextInt();
int r=1;
if(n>0){
System.out.println("The number is positive");
}
else{
System.out.println("The number is negative");
}
while(n>0){
r=r*n;
n=n-1;
}
System.out.println("The factorial of is "+r);
}
}
