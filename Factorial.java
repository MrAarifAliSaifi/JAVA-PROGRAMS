package Start;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		System.out.println("Enter the no:");
		num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of given no is:"+fact);
	}

}
