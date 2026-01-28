import java.util.Scanner;
class ForCounter{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter counter vaule :");
int n=s.nextInt();
for(int i=n;i>=0;i--){
System.out.println(i);
}
}
}	