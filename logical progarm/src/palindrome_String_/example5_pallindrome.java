package palindrome_String_;

public class example5_pallindrome 
{
	
	public static void main(String[] args) {
	
		String org = "madam";
		String rev="";
		
		for(int i =org.length()-1; i>=0; i--)
		{
			rev =rev + org.charAt(i);
		}	
		
		System.out.println("original string :"+ org);
		System.out.println("reverse string :"+ rev);
		
		
		if(org.equals(rev)) 
		{
			System.out.println("given string is pallindrome");
		}
		else 
		{
			System.out.println("given string is not a pallindrome");
		}
		
	}

}
