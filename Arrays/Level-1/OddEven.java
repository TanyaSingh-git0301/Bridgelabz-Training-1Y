import java.util.Scanner;
class OddEven{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int index=0;
		System.out.println("Enter number :");
		int num=s.nextInt();
		if(num<=0){
			System.out.println("ERROR: INPUT MUST BE A NATURAL NUMBER");
			return;
		}
		int even[]=new int[num/2+1];
		int odd[]=new int[num/2+1];
		int evenIndex =0, oddIndex=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				even[evenIndex++]=i;
			}
			else{
				odd[oddIndex++]=i;
			}
		}
		System.out.println("Odd number : ");
        for(int i=0;i<oddIndex;i++){
			System.out.print(odd[i] +" ");
		}
		System.out.println();
		
		System.out.println("Even number : ");
		for(int i=1;i<evenIndex;i++){
			System.out.print(even[i] +" ");
		}
		System.out.println();
	}
}
		