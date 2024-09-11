package palindrome_String_;

import java.util.Scanner;

public class Class7
{
	public static void main(String[] args)
	{
		Scanner l= new Scanner(System.in);
		System.out.println("Enter String ");
		String str = l.next();
		String rev= "";
		
		for(int i = str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Original string is " + str);
		System.out.println("Reverse String is: "+ rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Give String is palindrome");
		}
	}

}
