import java.util.Scanner;
class factor{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
int div=0;
for(int i=1;i<=num;i++){
    if(num%i==0){
	System.out.println(+i +" is the factor of " +num);}
}
}
}
