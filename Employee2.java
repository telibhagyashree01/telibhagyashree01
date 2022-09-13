class Employee2
{
	String name;
	String address;
	
	static String company_name;
	static int salary;

	void displaydata()
	{
	 System.out.println(name +" "+address);
	}

	static String completedTargets()
	{ 
	return "completed targets quickly" ;
 	}

	void AttendingMeetings(String s)
	{
		System.out.println(s);
	}

public static void main (String[]args)
{
Employee2 e1=new Employee2();
Employee2 e2=new Employee2();
Employee2 e3=new Employee2();
e1.address="ambernath";
e1.name="damu";

e2.address="ambernath";
e2.name="neha";

e3.address="ambernath";
e3.name="payal";

e1.displaydata();
e2.displaydata();
e3.displaydata();
System.out.println();
}
}