package palindrome_String_;

public class Class5 
{

	public static void main(String[] args) 
	{
		String str= "madam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("String value:"+ str);
		
		System.out.println("Reverse String "+ rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome ");
		}
	}
}
