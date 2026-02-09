import java.util.Scanner;
class StoreAndSum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double arr[]=new double[10];
double sum=0.0;
int index=0;
System.out.println("Enter number");
while(true){
double num=s.nextDouble();
if(num<=0 || index>+10)
break;
arr[index]=num;
sum+=num;
index++;
}
System.out.println("Enter numbers :");
for(int i=0;i<index;i++){
System.out.println(arr[i]);
}
System.out.println("Sum of the numbers : "+sum);
}
}

