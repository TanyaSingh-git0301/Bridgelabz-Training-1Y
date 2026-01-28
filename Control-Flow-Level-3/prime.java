import java.util.Scanner;
class prime{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number :");
int num=s.nextInt();
for(int i=2; i<num ;i++){
if(num%i==0){
System.out.println(+num +" is not a Prime Number");
break;}
else{
System.out.println(+num +" is a Prime Number");
break;
}
}
if(num==2){
	System.out.println(+num +" is a Prime Number");
}
}
}

