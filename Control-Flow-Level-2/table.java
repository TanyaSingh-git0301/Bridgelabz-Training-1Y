import java.util.Scanner;
class table{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int n=s.nextInt();
int t=1;
for(int i=6;i<=9;i++){
t=n*i;
System.out.println(+n +" " +"x" +" "+i +" " +"=" +" " +t);
}
}
} 
