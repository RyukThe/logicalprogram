package palindrome_String_;

import java.util.Scanner;

public class Class13 
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter String value");
		String org=m.next();
		
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Orginal String : " + org);
		System.out.println("reverse String : " + rev);
		
		if(org.equals(rev))
		{
			System.out.println("Given String Is Palindrome");
		}
		else
		{
			System.out.println("Given String Is Not Palindrome");
		}
		
	}

}
