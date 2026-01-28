import java.util.Scanner;
class fizz{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int n=s.nextInt();
if(n>=0){
System.out.println(+n +" Is a Positive Number");
for(int i=n;i<=n;i++){
	if(n%3==0 && n%5==0){
	System.out.println("FizzBuzz");}
}
for(int i=n;i<=n;i++){
	if(n%3==0){
	System.out.println("Fizz");}
}
for(int i=n;i<=n;i++){
	if(n%5==0){
	System.out.println("Buzz");}
}
}
else{
System.out.println(+n +"Is a not Positive Number");
}
}
}


