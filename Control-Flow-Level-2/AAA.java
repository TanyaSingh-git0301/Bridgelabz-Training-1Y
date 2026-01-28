import java.util.Scanner;
class AAA{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter age of Amar :");
int a=s.nextInt();
System.out.println("Enter age of Akhbar :");
int b=s.nextInt();
System.out.println("Enter age of Anthony :");
int c=s.nextInt();
System.out.println("Enter height of Amar :");
int d=s.nextInt();
System.out.println("Enter height of Akhbar :");
int e=s.nextInt();
System.out.println("Enter height of Anthony :");
int f=s.nextInt();
if(a>b && a>c){
System.out.println("Amar is the oldest of the three.");
}
else if(b>a && b>c){
System.out.println("Akhbar is the oldest of the three.");
}
else if(c>b && c>a){
System.out.println("Anthony is the oldest of the three.");
}
if(d>e && d>f){
System.out.println("Amar is the tallest of the three.");
}
else if(e>d && e>f){
System.out.println("Akhbar is the tallest of the three.");
}
else if(f>d && f>e){
System.out.println("Anthony is the tallest of the three.");
}
}
}

