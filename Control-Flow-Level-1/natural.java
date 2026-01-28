import java.util.Scanner;
class natural{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number : ");
int n=s.nextInt();
int sum=n*(n+1)/2;
if(n>0){
System.out.println("The sum of "+n +" " +"natural numbers is "+sum);
}
else{
System.out.println("The number "+n +" " +"is not a natural number.");
}
}
}