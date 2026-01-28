import java.util.Scanner;
class vote{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the age of the candidate : ");
int age=s.nextInt();
if(age>=18){
System.out.println("The person's age is "+age +" " +"and can vote.");
}
else{
System.out.println("The person's age is "+age +" " +"and cannot vote.");
}
}
}