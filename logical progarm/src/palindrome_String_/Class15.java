package palindrome_String_;

public class Class15
{
	public static void main(String[] args)
	{
		String o="level";
		String rev="";
		
		for(int i=o.length()-1;i>=0;i--)
		{
			rev=rev+o.charAt(i);
			
		}
		
		System.out.println("original String:"+ o);
		System.out.println("reverse String :"+ rev);
		
		
		if(o.equals(rev))
		{
			System.out.println("Given String is palindrome");
			
		}
		else
		{
			System.out.println("Given String not palindrome");
		}
		
	}

}
