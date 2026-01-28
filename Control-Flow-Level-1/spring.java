import java.util.Scanner;
class spring{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Month : ");
int m=s.nextInt();
System.out.println("Enter the Date : ");
int d=s.nextInt();
if(m==3 && d>=20 && d<=31){
		System.out.println("It's Spring Season.");
	}

else if(m==4 && d>=20 && d<=30){
		System.out.println("It's Spring Season.");
	}

else if(m==5 && d>=1 && d<=31){
		System.out.println("It's Spring Season.");
	}

else if(m==6 && d>=1 && d<=20){
		System.out.println("It's Spring Season.");
	}

else{
	System.out.println("It's Not Spring Season.");
}
}
}