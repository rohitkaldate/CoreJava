import java.lang.*;

class Company
{
	void name()
	{
		System.out.println("Company name is CISCO");
	}
}
class Manager extends Company{
	void fname()
	{
		System.out.println("Rohit is manager's name");
	}
}
class Employee extends Manager{
	void salary()
	{
		System.out.println("Salary is 2lac");
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee();	
		e.salary();
		e.fname();
		e.name();
	}
}