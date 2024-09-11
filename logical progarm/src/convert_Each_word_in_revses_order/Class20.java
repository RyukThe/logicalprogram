package convert_Each_word_in_revses_order;

public class Class20
{
	public static void main(String[] args)
	{
		String s="hello good morning";
		String s1[]=s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
			String or=s1[i];
			String rev="";
			
			for(int j=or.length()-1;j>=0;j--)
			{
				rev=rev+or.charAt(j);
			}
			
			System.out.print(rev+ " ");
		}
		
	}

}
