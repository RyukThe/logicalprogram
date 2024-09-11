package palindrome_String_;

public class Class22 
{
	public static void main(String[] args)
	{
		String k= "madam";
		String rev="";
		
		for(int i=k.length()-1;i>=0;i--)
		{
			rev=rev+k.charAt(i);
		}
		
		if(k.equals(rev))
		{
			System.out.println("gievn string is palindrome");
		}
		else
		{
			System.out.println("given String is not palindrome");
		}
		
	}

}
