package palindrome_String_;

import java.util.Scanner;

public class Class19 
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Eneter Word");
		String str = m.next();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		
		System.out.println("Orginal word: " + str);
		System.out.println("Reverse Word: " + rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}

}
