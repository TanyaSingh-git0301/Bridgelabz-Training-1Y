import java.util.Scanner;
class multiwhile{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
if(num>=0){
int counter=num-1;
while(counter>1){
if(num%counter==0){
System.out.println(+num +" is the a multiple of "+counter);
}
counter--;
}
}
}
}
