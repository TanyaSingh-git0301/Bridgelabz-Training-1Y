import java.util.Scanner;
class fee{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter fee : ");
int fee=s.nextInt();
System.out.println("Enter Discount Percent : ");
int dp=s.nextInt();
int Discount=(fee*dp)/100;
int Finalfee=fee-Discount;
System.out.println("The discount amount is INR "+Discount +"  " +"and final discounted fee is INR : " +Finalfee);
}
}
