package javaexample;

public class Android_phone {

	public static void main(String[] args) {
		Android_Phone[] obj = new Android_Phone[3];
			obj[0]= new Android_Phone (8, "Black");
			obj[1]= new Android_Phone (6, "Red");
			obj[2] =  new Android_Phone (4, "blue");
			
			System.out.println("realmi");
			obj[0].display();
			System.out.println("oppo:"); 
			obj[1].display();
			System.out.println("samsung ");
			obj[2].display();
	}
}

			class Android_Phone
			{
			int RAM;
			String color;
			Android_Phone(int ram,String c)
			{
				RAM= ram;
				color = c;
				} public void display() 
			{
				System.out.print("RAM size ="+RAM+""+"Color of Android_phone="+color);
				System.out.println();
	}

}
