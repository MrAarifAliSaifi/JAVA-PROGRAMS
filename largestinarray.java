package arrayBasic;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the array size");
		int n=sc.nextInt();
		System.out.println("Plese enter the array elements");
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[0]<array[i]);
			max=array[i];
		}
		System.out.println("THE LAARGEST ELEMENTS IN THE ARRAY IS:"+max);
		
	}

}
