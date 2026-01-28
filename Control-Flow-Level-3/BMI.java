import java.util.Scanner;
class BMI{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Weight (in kg):");
double w=s.nextInt();
System.out.println("Enter Height (in cm):");
double h=s.nextInt();
double b=(w/(h*h))/10000;
if(b<=18.4){
System.out.println("Underweight");
}
else if(b>=18.5 && b<=24.9){
System.out.println("Normal");
}
else if(b>=25.0 && b<=39.9){
System.out.println("Overweight");
}
else{
System.out.println("Obese");
}
}
}