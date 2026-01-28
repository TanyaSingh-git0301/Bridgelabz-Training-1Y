import java.util.Scanner;
class idk{
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
	for(int i=1; i<=n; i++){
     r=r+i;	
	 }
	 System.out.println("The sum of natural number using formula is "+sum +" " +"and using for loop "+r);
}
}
	 