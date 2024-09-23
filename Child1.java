import java .lang.*;
class Parent
{
	void adult()
	{
		System.out.println("You are adult");
	}
}

class Child1 extends Parent
{
	void young()
	{
		System.out.println("You are young child");
	}
	
	public static void main(String args[])
	{
		Child1 c=new Child1();
		c.young();
		c.adult();
	}
	
}