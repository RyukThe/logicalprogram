package convert_Each_word_in_revses_order;

public class Class17 
{
	public static void main(String[] args) 
	{
		String s= "My Name IS Saurav";
		String ar[]=s.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			String rev = RevString(org);
			System.out.print(rev+ " ");
			
		}
		
	}
	
	
	public static String RevString(String org)
	{
		String  rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		return rev;
		
	}

}
