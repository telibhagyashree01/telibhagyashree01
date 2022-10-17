package corejava;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the number of rows : ");
	         //Taking row as input
	        int row = sc.nextInt();
	    
	        System.out.println("Enter the number of columns : ");
	        //Taking columns as input
	        int col = sc.nextInt();
	        
	        //Decalaring the 2-D Matrix
	        int array[][]  = new int[row][col];
	       
	        //Read the matrix value
	        System.out.println("Enter the values of Matrix A:");
	        for(int i=0;i<row;i++){
	            for(int j=0; j<col ; j++){
	                array[i][j] = sc.nextInt();
	                //Accessing arrays values
	            }
	        }
	        
	        System.out.println("Enter the values of Matrix B:");
	        for(int i=0;i<row;i++){
	            for(int j=0; j<col ; j++){
	                array[i][j] = sc.nextInt();
	                //Accessing arrays values
	            }
	        }
	        
	        // Adding Matrix A and Matrix B
	        
	        int[][] resultantMatrix = new int[row][col];
	        
	        for(int i=0;i<row;i++){
	            for(int j=0; j<col ; j++){
	                resultantMatrix[i][j] = array[i][j] + array[i][j];
	            }
	        }
	        
	        //Displaying the resultant matrix
	        System.out.println("Sum of Matrix A and Matrix B is ");
	        for(int i=0;i<row;i++){
	            for(int j=0; j<col ; j++){
	                System.out.print(resultantMatrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	    }
}
	    
	