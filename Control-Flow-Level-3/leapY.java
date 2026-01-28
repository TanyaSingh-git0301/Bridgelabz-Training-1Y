import java.util.Scanner;
class leapY{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter year :");
int year=s.nextInt();
if(year>=1582){
	if(year%4==0 && year%100!=0 || year%400==0){
	System.out.println(+year +" is a Leap year");
}
else{
System.out.println(+year +" is not a Leap Year");
}
}
}
}