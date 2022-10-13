package javacore;

public class natural__number {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num=0;
		int a ;
		int x=1;
		
		
		while(x <= 10) 	{
			
			
			System.out.print("Enter Natural Numbers : ");
			a = sc.nextInt();
			if (a<=0) {
				
			}else {
			num=num+a;
			x++;
		}
			}
		
		System.out.println("Sum is");
		System.out.println(num);

	}

	}
