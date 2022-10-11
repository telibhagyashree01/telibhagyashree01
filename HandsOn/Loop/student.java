/* To create code using if else loop to check user will be eligible for score or not
 * name:bhagyaashree_teli
 * date:- 11/10/22
 */

package javacore;
import java.util.Scanner;
public class student {

	public static void main(String[] args)
	{

		    int marksObtained, passingMarks;
		   
		    passingMarks = 40;
		   
		    Scanner input = new Scanner(System.in);
		   
		    System.out.print("Input marks scored by you : ");
		   
		    marksObtained = input.nextInt();
		   
		    if (marksObtained >= passingMarks) {
		      System.out.println("You passed the exam ");
		    }
		    else {
		      System.out.println("Unfortunately, you failed to pass the exam ");
		    }
		  }
	}
