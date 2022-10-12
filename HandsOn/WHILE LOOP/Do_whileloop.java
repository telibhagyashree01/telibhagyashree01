package Myjava;

import java.util.Scanner;

public class Do_whileloop {

	public static void main(String[] args) {
		{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number that you want to reverse: ");
			int num = sc.nextInt();
			
			
			do
			{
				System.out.println(num);
				num--;
			}
			
			while (num>0);
		
			}
		}
	}


