import java.lang.*;
import java.util.*;

class Forloop
{
	public static void main(String args[])
	{
		/*
		for(int i=1;i<=4;i++)
		{
			System.out.println("****");
		}
		*/
		
		
		//Reverse a number: 
		/*
		int n=2611;
		int rem;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rem+(rev*10);
			n=n/10;
			
		}
		System.out.println(rev);
		*/
		
		//Pallindrome number:
		
		/*
		int n=2442;
		int rev=0;
		int temp;
		temp=n;
		
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		if(rev==temp)
		{
			System.out.println("No is pallindrome");
		}
		else
		{
			System.out.println("No is not pallindrome");
		}
		*/
		
		//Check no is prime or not:
		
		/*
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no: ");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("No is prime");
		}
		else
		{
			System.out.println("No is not prime");
		}
		*/
		
		// Check no is armstrong or not:
		/*
		int rem;
		int rev=0;
		int temp;
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev+(rem*rem*rem);
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println("No is not armstrong");
		}
		*/
		//sum of 10 natural nos:
		/*
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}
		*/
		/*
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate sum : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=(n*(n+1))/2;
			System.out.println(sum);
		}
		*/
		
		
		//Fibonacci series:
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate sum : ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}