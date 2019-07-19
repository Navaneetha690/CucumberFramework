package Java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		String str="Navaneetha";
		String rev="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Reverse string is:"+rev);
	}

}
