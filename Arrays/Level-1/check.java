import java.util.Scanner;
class check{
public static void  main(String args[])
{
Scanner s=new Scanner(System.in);
int num[]=new int[5];
System.out.println("Enter number");
for(int i=0; i<5; i++){
num[i]=s.nextInt();
}

for(int i=0; i<5; i++){
if(num[i]>0){
System.out.println(+num[i] +" is a Positive NUmber ");
if(num[i]%2==0){
System.out.println("Also an Even Number");
}
else{
System.out.println("Also an Odd Number");
}
}
else if(num[i]<0){
System.out.println(+num[i] +" is a Negative Number");
}
else{
System.out.println("Zero");
}
}
if(num[0]==num[4]){
System.out.println("Last and First numbers are equal");
}
else if(num[0]>num[4]){
System.out.println("Last Number is less than First Number");
}
else if(num[0]<num[4]){
System.out.println("Last Number is greater than First Number");
}
}
}

