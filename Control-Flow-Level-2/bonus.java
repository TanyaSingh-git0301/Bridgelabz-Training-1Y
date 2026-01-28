import java.util.Scanner;
class bonus{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("Enter the salary :");
int n=s.nextInt();
System.out.println("Enter the years of sevice :");
int y=s.nextInt();
double b=n+(n * 0.05);
if(n>5){
System.out.println("The bounus amount is "+b);
}
else{
System.out.println("No bonus");
}
}
}
