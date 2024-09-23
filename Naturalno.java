import java.lang.*;
import java.util.*;
class Naturalno
{
	public static void main(String args[])
	{
		/* Nos from 1 to 10: 
		
		int i=1,n=10;
		while(i<n)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		//Multiplication table :
		
		/*
		int n=2,i=1;
		while(i<11)
		{
			
			System.out.println(i*n);
			i++;
		}
		*/
		
		//nos from 1 to n: take n from user
		
		/*
		int i=1;
		while(i<5)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		int i=1;
		int sum=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number to calculate sum: ");
		int n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
}