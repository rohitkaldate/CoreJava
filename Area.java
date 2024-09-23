import java.lang.*;
import java.util.*; //Package consists pf Scanner Class

class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		
		float r=sc.nextFloat();
		
		double area=3.14*r*r; //Area of circle
		
		System.out.println("Area of circle is: "+area);
		
	}
		
}