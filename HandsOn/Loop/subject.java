/* demonstrate if -else statement of 5 subject the person who get
 above 60% will be passed otherwise failed output should be like
 enter your name .enter marks for the 5 subjects from the user.
 name:bhagyaashree_teli
 date:- 11/10/22 */

package javacore;
import java.util.Scanner;
public class subject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name= sc.nextLine();		
		System.out.println("Enter your marks of 5 subject:");	
		int marathi = sc.nextInt();
		int hindi = sc.nextInt();
		int science = sc.nextInt();	
		int chemistry = sc.nextInt();	
		int maths = sc.nextInt();
		int sum = marathi+hindi+science+chemistry+maths;
		int marksobtained = 100;
	    if (marksobtained >= 60) {
	      System.out.println("You passed the exam.");
	    }
	    else {
	      System.out.println("Unfortunately, you failed to pass the exam.");
	    }
	}

	}

