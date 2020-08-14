package Stringpractice;
import java.util.Arrays;
public class AnagramOfString {
	public static void main(String[] args) {
	String str="Aarif";
	String str1="Arifa";
	str=str.toLowerCase();
	str1=str1.toLowerCase();
	if(str.length()!=str1.length())
	{
		System.out.println("strings"+" "+str+" "+"and"+" "+str1+" " +"are not anagram");
	}
	else
	{
		char arr[]=str.toCharArray();
		char arr1[]=str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
	    if(Arrays.equals(arr, arr1)==true)
	    {
	    	System.out.println("the strings are anagrm");
	    }
	    else
	    	System.out.println(" the strings are not anagram");		
	}
	}
}
