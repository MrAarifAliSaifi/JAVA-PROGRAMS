package arrayBasic;

import java.util.Scanner;

public class TransferElementsOfOneArrayInToAnother {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the array size");
		int n=sc.nextInt();
		System.out.println("Plese enter the array elements");
		int array[]=new int[n];
		int array1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			array1[i]=array[i];
		}
		System.out.println("THE ELEMENTS OF THE SECOND ARRAY IS");
		for(int m:array1)
			System.out.println(m);
	}

}
