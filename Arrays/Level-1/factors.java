import java.util.Scanner;
class factors{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int maxFactors=10;
		int factor[]=new int[maxFactors];
		int index=0;
		System.out.println("Enter number :");
		int num=s.nextInt();
		for(int i=1; i<=num;i++){
			if(num%i==0){
				factor[index++]=i;
			}
		}
			for(int i=0;i<index;i++){
			System.out.print(factor[i] +" ");
			}
		}
	}
