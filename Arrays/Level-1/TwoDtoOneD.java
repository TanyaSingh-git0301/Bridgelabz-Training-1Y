import java.util.Scanner;
class TwoDtoOneD{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
int arr2D[][]=new int[3][3];
System.out.println("Enter the array elements :");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		arr2D[i][j]=s.nextInt();
	}
}
int row=arr2D.length;
int col=arr2D[0].length;
int arr1D[]=new int[row*col];
int index=0;
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr1D[index]=arr2D[i][j];
int num=arr1D[index];
System.out.print(num +" ");
index++;
}
}
}
}
