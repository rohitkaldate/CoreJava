import java.lang.*;

class Employee
{
	float salary=40000f;
}

class Programmer extends Employee
{
	int bonus =30000;
	
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Salary is: "+p.salary);
		System.out.println("Bonus  is: "+p.bonus);
	}
}