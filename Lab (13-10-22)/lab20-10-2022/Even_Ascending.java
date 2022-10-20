package javacore;
import java.util.Scanner;
import java.util.Arrays;
public class Even_Ascending {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("enter a number");
	        int n = sc.nextInt();

	        int s[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            int e = sc.nextInt();
	            s[i] = e;
	        }

	        Arrays.sort(s);
	        // Even in ascending
	        System.out.println("\nEven numbers in ascending order:");
	        for (int j = 0; j < n; j++) {

	            if (s[j] % 2 == 0) {
	                System.out.print(s[j] + " ");
	            }
	        }
	 
	}

}
