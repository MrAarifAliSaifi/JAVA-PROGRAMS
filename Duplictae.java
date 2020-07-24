package arrayBasic;

import java.util.Scanner;
public class DuplicateElemntsInArrar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the array size");
		int n=sc.nextInt();
		System.out.println("Plese enter the array elements");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			}
		}
		
		
	}

}
