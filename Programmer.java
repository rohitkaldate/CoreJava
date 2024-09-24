import java.lang.*;

class Employer
{
	String name="Rohit";
	float salary=40000f;
}

class Programmer extends Employer
{
	int bonus =30000;
	
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Name of employee is: "+p.name);
		System.out.println("Salary is: "+p.salary);
		System.out.println("Bonus  is: "+p.bonus);
	}
}