import java.lang.*;	//java lang package

class Addition	//class name
 {
	public static void main(String args[])	//main method
{
	// int a=10;//value of a
	// int b=20;//value of b
	// int sum=a+b;//sum of a and b
	// System.out.println("Addition of a and b is:"+sum);//print addition of a and b
	

	//Method calling for the addition program:

	int a=10;
	int b=20;
	int c=add(a,b);
	System.out.println("Sum of a and b is: "+c);



}

static int add(int n1, int n2)
{
	int s;
	s=n1+n2;
	return s;
}



}