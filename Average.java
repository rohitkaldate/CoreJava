import java.lang.*;
import java.util.*; //Package consists pf Scanner Class

class Average
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter first no: ");
		a=sc.nextInt();
		
		System.out.println("Enter second no: ");
		b=sc.nextInt();
		
		System.out.println("Enter third no: ");
		c=sc.nextInt();
		
		float average=(a+b+c)/3;
		System.out.println("Average of 3 nos is: "+average);
	}
}