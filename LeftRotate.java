package arrayBasic;
import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the array size");
		int n=sc.nextInt();
		System.out.println("Plese enter the array elements");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			System.out.print(" "+array[i]+" ");
		}
		System.out.print(array[0]);

	}

}
