import java.util.Scanner;
class powerwhile{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter number : ");
int num=s.nextInt();
System.out.println("Enter the power :");
int pow=s.nextInt();
int result=1;
int counter=0;
while(counter<pow){
result=result*num;
counter++;
}
System.out.println(+num +" to the power " +pow +" is " +result);
}
}
