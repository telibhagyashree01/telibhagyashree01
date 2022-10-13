package javacore;
import java.util.Scanner;
public class percentage {

	public static void main(String[] args) {
					
			
							Scanner scan = new Scanner(System.in);
							System.out.println("if percentage:");
							double percentage = scan.nextDouble();

							if(percentage >= 90)	{
								
								System.out.println("A");
							}
							
							else if(percentage < 90 && percentage >= 80)
							{
								System.out.println("B");
							}
							
							else if(percentage < 80 && percentage >= 70)
							{
								System.out.println("C");
							}
							
							else if(percentage < 70 && percentage >= 60)
							{
								System.out.println("D");
							}
							
							else if(percentage < 60 && percentage >= 50)
							{
								System.out.println("E");
							}
							else 
							{
								System.out.println("Failed!");
							}
						}

					

	}


