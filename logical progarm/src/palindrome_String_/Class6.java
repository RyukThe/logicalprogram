package palindrome_String_;

public class Class6 
{
	public static void main(String[] args) 
	{
		String k= "civic";
		String rev="";
		
		for(int i= k.length()-1;i>=0;i--)
		{
			rev=rev+k.charAt(i);
		}
		
		System.out.println("orginal String is: "+ k);
		System.out.println("Reverse String is : "+ rev);
		
		if(k.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is Palindrome");
		}
		
	}

}
