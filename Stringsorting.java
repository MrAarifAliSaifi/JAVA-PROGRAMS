package Stringpractice;
import java.util.Arrays;
public class SortingOfArray
{
	public static void main(String[] arg) 
	{
		char arr[]= {'a','b','v','n','g'};
		char arr1[]= {'a','v','b','f','g'};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for(char i:arr)
		System.out.print(i+" ");
		System.out.println("\n");
		for(char i:arr1)
		System.out.print(i+" ");
		
	}

}
