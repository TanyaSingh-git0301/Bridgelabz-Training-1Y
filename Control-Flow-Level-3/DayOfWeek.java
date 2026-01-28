import java.util.Scanner;
class DayOfWeek{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Date :");
int d=s.nextInt();
System.out.println("Enter Month :");
int m=s.nextInt();
System.out.println("Enter Year :");
int y=s.nextInt();
int a=y-(14-m)/12;
int x=a+(a/4)-(a/100)+(a/400);
int b=m+12*((14-m)/12)-2;
int c=(d+x+31*b/12)%7;
if(c==0){
System.out.println("Sunday");
}
else if(c==1){
System.out.println("Monday");
}
else if(c==2){
System.out.println("Tuesday");
}
else if(c==3){
System.out.println("Wednesday");
}
else if(c==4){
System.out.println("Thusday");
}
else if(c==5){
System.out.println("Friday");
}
else if(c==6){
System.out.println("Saturday");
}
}
}