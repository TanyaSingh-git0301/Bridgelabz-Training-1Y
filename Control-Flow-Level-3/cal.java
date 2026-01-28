import java.util.Scanner;
class cal{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number 1 :");
int first=s.nextInt();
System.out.println("Enter number 2 :");
int second=s.nextInt();
System.out.println("Enter operator :");
String op=s.next();
switch (op) {
case "+" :
System.out.println(first+second);
break;
case "-" :
System.out.println(first-second);
break;
case "*" :
System.out.println(first*second);
break;
case "/" :
if(second==0)
	System.out.println("Error : Division with zero");
else
	System.out.println(first/second);
break;
default : 
System.out.println("Invalid Operator");
}
}
}

