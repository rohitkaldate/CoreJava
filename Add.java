
import java.util.*; //Package consists pf Scanner Class

class Add 
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in); //Scanner class for taking inputs from users
		
		System.out.println("Enter value of a:");//Enter input a from user
		a=sc.nextInt();
		
		System.out.println("Enter value of b:");//Enter input b from user
		b=sc.nextInt();
		
		c=a+b; //Sum of two inputs
		
		System.out.println("Sum of the inputs: "+c); //Printing sum of the inputs
	}

}