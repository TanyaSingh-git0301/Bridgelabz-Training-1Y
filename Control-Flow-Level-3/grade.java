import java.util.Scanner;
class grade{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter marks of physics :");
int p=s.nextInt();
System.out.println("Enter marks of chemistry :");
int c=s.nextInt();
System.out.println("Enter marks of maths :");
int m=s.nextInt();
int per=(p+c+m)/3;
if(per>=80){
System.out.println("Marks : "+per);
System.out.println("Grade : A");
System.out.println("Remarks : Level 4, above agency-normalized standards");
}
else if(per<=79 && per>=70){
System.out.println("Marks : "+per);
System.out.println("Grade : B");
System.out.println("Remarks : Level 3, at agency-normalized standards");
}
else if(per<=69 && per>=60){
System.out.println("Marks : "+per);
System.out.println("Grade : C");
System.out.println("Remarks : Level 2, below, but approaching agency-normalized standards");
}
else if(per<=59 && per>=50){
System.out.println("Marks : "+per);
System.out.println("Grade : D");
System.out.println("Remarks : Level 1, well below agency-normalized standards");
}
else if(per<=49 && per>=40){
System.out.println("Marks : "+per);
System.out.println("Grade : E");
System.out.println("Remarks : Level 1, too below agency-normalized standards");
}
else {
System.out.println("Marks : "+per);
System.out.println("Grade : R");
System.out.println("Remarks : Remedial standards");
}
}
}