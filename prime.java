package Start;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any no");
		int n=sc.nextInt();
		int m=n/2;
		boolean flag=false;
		if((n==0)||(n==1))
		{
			System.out.println("The no is not prime");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					flag =true;
				}
			}
			if(flag==true)
			{
				System.out.println("the no is not prime");
			}
			else
				System.out.println("The no is  prime");
	    }
	
}
}
