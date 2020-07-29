package Stringpractice;

import java.util.Scanner;
public class TotalCharInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String str="aarif ali saifi";	
	    int count=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)!=' ')
	    		count++;
	    }
	    System.out.println(count);
//	    System.out.println("The total no of charcter in the string:"+count);
	    
	    
	}

}
