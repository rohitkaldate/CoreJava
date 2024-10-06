import java.lang.*;
public class TryCatch {

	public static void main(String[] args)
    {
		int i=50;
		int j=0;
		int data;
		try
		{
		data=i/j; //may throw exception 
		}
            // handling the exception
		catch(ArithmeticException e)
		{
             // resolving the exception in catch block
			System.out.println(e);
		}
        System.out.println(i/(j+2));
	}
}
