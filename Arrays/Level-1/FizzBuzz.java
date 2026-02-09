import java.util.Scanner;
class FizzBuzz{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=s.nextInt();
		String result[]=new String[num];
		for(int i=0; i<num ;i++){
			
		if((i+1)%5==0 && (i+1)%3==0){
			result[i]="FizzBuzz";
		}
		else if((i+1)%5==0){
			result[i]="Buzz";
		}
		else if((i+1)%3==0){
			result[i]="Fizz";
		}
		else{
			result[i]=String.valueOf(i+1);
		}
		}
	for(int i=0;i<num;i++){
		System.out.println("Position "+(i+1) +" = " +result[i]);
	}
	}
}
		