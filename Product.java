import java.lang.*;
import java.util.*; //Package consists pf Scanner Class

class Product{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no: ");
		a=sc.nextInt();
		System.out.println("Enter second no: ");
		b=sc.nextInt();
		
		c=a*b;
		System.out.println("Product of two numbers is: "+c);
	}
}