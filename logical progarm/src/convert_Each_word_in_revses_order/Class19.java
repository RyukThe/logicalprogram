package convert_Each_word_in_revses_order;

public class Class19 
{
	public static void main(String[] args) 
	{
		String s ="Get Url From Google";
		String s1[]=s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
			String org=s1[i];
			
			String rev = m1(org);
			System.out.print(rev+ " ");
			
			
		}
		
		
		
	}
	
	public static String m1(String org)
	{
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		return rev;
	}

}
