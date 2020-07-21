package Start;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Armstrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int num,test=0,see=0,sum=0;
				System.out.println("Enter the no");
				num=sc.nextInt();
				int n=num;
				while(num>=1)
				{
				test=num%10;
				see=test*test*test;
				sum=sum+see;
				num=num/10;
				}
				if(sum==n)
				{
					System.out.println("Armstrome ");
				}
				else
					System.out.println("not !Armstrome");
				
	}

}
