import java.util.Scanner;
class table{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number you want the table of:");
int num=s.nextInt();
int mul[]=new int[10];
for(int i=1;i<=10;i++){
mul[i-1]=num*i;
}
for(int i=1;i<=10;i++){
System.out.println(+num +" * " +i +" = " +mul[i-1]);
}
}
}