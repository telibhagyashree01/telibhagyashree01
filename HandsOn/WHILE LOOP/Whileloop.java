/*
 //program  to demonstrate while loop continues until entered number is positive.
//Take the input from the user
 * name:bhagyashree teli
 * date:12/10/202
 */

package Myjava;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		if(num<0) {
		System.out.println("HELLO EVERYONE !!!");
		break;
		}
	}
	}
}
