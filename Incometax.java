import java.lang.*;
class Incometax
{
	public static void main(String args[])
	{
		double income=800000.3;
		double tax;
		if(income<500000)
		{
			tax=0;
		}
		else if(income>=500000 && income<1000000)
		{
			tax=income*(0.2);
			
		}
		else
		{
			tax=income*(0.3);
		}
		System.out.println("Your tax is: "+tax);
	}
}