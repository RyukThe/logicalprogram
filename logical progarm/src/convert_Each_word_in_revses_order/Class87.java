package convert_Each_word_in_revses_order;

public class Class87
{
	public static void main(String[] args) 
	{
		String s="Saurav dadu kj";
		String s1[]=s.split(" ");
		
		for(int a=0;a<=s1.length-1;a++)
		{
			String sd=s1[a];
			String rev="";
			for(int i=sd.length()-1;i>=0;i--)
			{
				rev=rev+sd.charAt(i);
			}
			System.out.print(rev+" ");
		}
		
	
		
	}

}
