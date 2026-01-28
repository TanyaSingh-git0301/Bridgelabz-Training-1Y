import java.util.Scanner;
class counter{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter counter vaule : ");
int c=s.nextInt();
while(c>=0){
System.out.println(c);
c--;
}
}
}