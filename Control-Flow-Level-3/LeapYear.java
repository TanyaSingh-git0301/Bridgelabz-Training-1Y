import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the year : ");
int year=s.nextInt();
if(year>=1582){
if(year%4==0){
if(year%100==0){
if(year%400==0){
	System.out.println(+year +" is a Leap year");
}
else{
System.out.println(+year +" is not a Leap year");
}
}
else{
System.out.println(+year +" is not a Leap year");
}
}
else{
System.out.println(+year +" is not a Leap year");
}
}
else{
System.out.println("Year should be graeter than 1582");
}
}
}
