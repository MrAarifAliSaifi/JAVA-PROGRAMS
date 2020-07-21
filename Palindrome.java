package Start;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int num=sc.nextInt();
		int n=num,set=1,over=0;
		while(num>=1)
		{
		  set=num%10;
		  over=over*10+set;
		  num=num/10;
	    }
		if(over==n)
		{
			System.out.println("yes!palindrome");
		}
		else
			System.out.println("no!not palindrome");
}
}
