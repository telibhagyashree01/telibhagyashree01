/*
 Name:Bhagyashree_teli
date : 6 OCT2022
 */

package Myjava;
import java.util.Scanner;
public class calculation {

	public static void main(String[] args)
	{
		//creating variable
		int A,B,C,D;
		int add=0;
		int sub=0;
		int multiplication = 0;
		int division = 0;
		
		//creative Scanner object
		Scanner sc= new Scanner(System.in);
		
		//first value from user
		System.out.println("Enter first value");
		 A = sc.nextInt();
		//second value from user
		 System.out.println("Enter second value");
		 B = sc.nextInt();
		//third value from user
		System.out.println("Enter third value");
	        C = sc.nextInt();
		
		//choice to user
		 System.out.println("Enter 1 : if you want addition");
		 System.out.println("Enter 2 : if you want substraction");
		 System.out.println("Enter 3 : if you want multiplication");
		 System.out.println("Enter 4 : if you want division");
		 D = sc.nextInt();
		//use if else
		 if(D==1)
		 {
			 add=A+B;
			 System.out.println("the addition of A and B is" +add);
		 }
		 else if(D==2)
		 {
			 sub=B-C;
			 System.out.println("the substraction of A and B is" +sub);
		 }
			 else if(D==3)
			 {
				 sub=C*D;
				 System.out.println("the multiplication of A and B is" +multiplication);
			 }
				 else if(D==4)
				 {
					 sub=D/A;
					 System.out.println("the division of A and B is" +division);
				 }
		            System.out.println("the pressed wrong choice");
					 
				 
				 
			 
		 }
	}


