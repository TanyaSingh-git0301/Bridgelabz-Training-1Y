import java.util.Scanner;
class Student{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number of pens : ");
int pen=s.nextInt();
System.out.println("Enter number of Students : ");
int stu=s.nextInt();
int que=pen/stu;
int rem=pen%stu;
System.out.println("Que : "+que +" "+"Rem : "+rem);


}
}


