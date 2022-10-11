/*To create multiplication table using for loop
 * name:bhagyaashree_teli
 	date:- 11/10/22
 */

package javacore;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args)
	{
		    Scanner scan=new Scanner(System.in);
		    System.out.print("Enter the number Which is being to be multiplied :");
		    int a=scan.nextInt();
		    System.out.println("Enter the multiplication range");
		    int b=scan.nextInt();
		    System.out.println("The multiplication table of:"+a+" is given below");
		    for(int i=1;i<=b;i++)
		    {
		      System.out.println(a+" * "+i+" = "+(a*i));
		    }
		    
		  }
	}

