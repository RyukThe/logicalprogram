package Reverse_String;

import java.util.Scanner;

public class Class10
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr String");
		String str =sc.next();
		String rev="";
		
		for(int i =str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Original String :" +str);
		System.out.println("Reverse String :"+ rev);
		
	}

}
