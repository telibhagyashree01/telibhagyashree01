/* Program : Program for multi dimensional array
 * Name : Bhagyashree Teli
 * Date : 17-10-22
 */

package Matrix;

//Importing Scanner
import java.util.Scanner;

public class Two_Dimensional_Array {

	public static void main(String[] args) {

		int i, j, a, b; 
		
		//importing scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking input for number of rows from user 
		System.out.print("Enter the number of rows :");
		a = sc.nextInt();
		
		//Taking input for number of column from user 
		System.out.print("Enter the number of column : ");
		b = sc.nextInt();
		
		int array[][] = new int[a][b];
		
		System.out.println("Enter the no of array :");
		
		//Using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		//Printing total elements of array
		System.out.println("Element of array is ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				//printing values of i j
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}


	}

}
