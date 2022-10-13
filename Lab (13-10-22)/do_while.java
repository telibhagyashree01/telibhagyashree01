package javacore;
import java.util.Scanner;
public class do_while {

	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num=0;
		int x ;
		int y=1;
		
		
		while(y <= 10) 	{
			
			
			System.out.print("Enter Natural Numbers : ");
			x = sc.nextInt();
			if (x<=0) {
				
			}else {
			num=num+x;
			y++;
		}}
		
		System.out.println("Sum of 10 natural Numbers is");
		System.out.println(num);
			}
		}


