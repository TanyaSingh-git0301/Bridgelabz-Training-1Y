import java.util.Scanner;
class compare{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int n=s.nextInt();
int r=0;
int sum=n*(n+1)/2;
if(n>0){
	System.out.println("Natural number");
}
else{
	System.out.println("Not a natural number");
}
while(n>0){
	r=r+n;
	n=n-1;
}
System.out.println("The sum of natural number using formula is "+sum +" " +"and the sum using while loop is "+r);
}
}