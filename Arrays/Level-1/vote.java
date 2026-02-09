import java.util.Scanner;
class vote{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int age[]=new int[10];
System.out.println("Enter ages of the students");
for(int i=0; i<10 ; i++){
age[i]=s.nextInt();
}
for(int i=0; i<10;i++){
if(age[i]>0){
if(age[i]>=18){
System.out.println("The student with the age "+age[i] +" can vote.");
}
else{
System.out.println("The student with the age "+age[i] +" cannot vote.");
}
}
else{
System.out.println("Enter a valid age");
}
}
}
}
