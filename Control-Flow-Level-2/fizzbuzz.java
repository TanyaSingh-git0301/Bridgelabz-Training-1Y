import java.util.Scanner;
class fizzbuzz{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int n=s.nextInt();
if(n>=0){
System.out.println(+n +" is a Positive number");

while(n%3==0 && n%5==0){
System.out.println("FizzBuzz");
break;
}
while(n%3==0){
System.out.println("Fizz");
break;
}
while(n%5==0){
System.out.println("Buzz");
break;
}
}
else{
System.out.println(+n +" is a not a positive number");
}
}
}

