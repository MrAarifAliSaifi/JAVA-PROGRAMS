package arrayBasic;

import java.util.Scanner;

public class SmaleestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the array size");
		int n=sc.nextInt();
		System.out.println("Plese enter the array elements");
		int array[]=new int[n];
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("THE SUM OF THE ARRAY"+sum);
	}

}
