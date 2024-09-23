import java.lang.*;
import java.util.*; //Package consists pf Scanner Class

class Square{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int side;
		
		System.out.println("Enter side of square: ");
		side=sc.nextInt();
		int area=side*side;
		
		System.out.println("Area of square: "+area);
	}
}