/*
 * shorting of array 
 Name = BHAGYASHREE TELI
 Date = 19/10/22
 */


package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Shorting_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements of an array");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//to arrange arrays in ascending order we used sort method.
	    Arrays.sort(a);
		System.out.println("\nResult");
		
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		
	}

}