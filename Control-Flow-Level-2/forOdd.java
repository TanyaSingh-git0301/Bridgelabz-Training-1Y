import java.util.Scanner;
class forOdd{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
int n=s.nextInt();
for(int i=n;i>=1;i--){
	if(i%2==0){
		System.out.println("The number "+i +" is even");
	}
else{
System.out.println("The number "+i +" is odd");
}	
}
}
}
