import java.lang.*;
import java.util.*;

class Lasrgestno
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter a: ");
		a=sc.nextInt();
		
		System.out.println("Enter b: ");
		b=sc.nextInt();
		
		System.out.println("Enter c: ");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>a &&b>c)
		{
			System.out.println("b os largest ");
		}
		else
		{
			System.out.println("c is largest");
		}
	}
}