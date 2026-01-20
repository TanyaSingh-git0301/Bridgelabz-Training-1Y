class StudentFee{
public static void main(String args[])
{
int a=125000;
System.out.println("Fee is : "+a);
int d=10;
System.out.println("Discount Percentage is : "+d);
int Discount=(a*d)/100;
int Finalfee=a-Discount;
System.out.println("The discount amount is INR "+Discount +"  " +"and final discounted fee is INR : " +Finalfee);
}
}