package convert_Each_word_in_revses_order;

public class Class6 
{
	public static void main(String[] args)
	{
		String s="dsds$fds$dsds$dsasd";
		String l[]=s.split("\\$");
		
		for(int i=0;i<=l.length-1;i++)
		{
			String o=l[i];
			String rev = rev(o);
			
			System.out.print(rev+" ");
		}
		
	}
	
	public static String  rev(String o) 
	{
		String rev="";
		for(int i=o.length()-1;i>=0;i--)
		{
			rev=rev+o.charAt(i);
		}
		return rev;
		
	}

}
