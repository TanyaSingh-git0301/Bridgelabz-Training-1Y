import java.util.Scanner;
class MeanHeight{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	double heights[]=new double[11]; 
	double sum=0.0;
	System.out.println("Enter the height of the players: "); 
	for(int i=0;i<11;i++){
		heights[i]=s.nextDouble();
		sum+=heights[i];
	}
	System.out.println("The mean height of the players : "+sum/11);
}
}