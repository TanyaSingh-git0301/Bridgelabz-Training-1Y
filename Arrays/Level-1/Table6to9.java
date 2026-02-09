import java.util.Scanner;
class Table6to9{
public static void main(String args[])
{
int multiplicationResult[]=new int[4];
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int num=s.nextInt();

for(int i=6;i<=9;i++){
multiplicationResult[i-6]=num*i;
}
for(int i=6;i<=9;i++){
System.out.println(+num +" * " +i +" = " +multiplicationResult[i-6]);
}
}
}

