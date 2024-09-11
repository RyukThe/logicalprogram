package convert_Each_word_in_revses_order;

public class Class23 
{
	public static void main(String[] args)
	{
		String s="Hello my name is Saurav";
		String []k=s.split(" ");
		
		for(int i=1;i<=k.length-1;i++)
		{
			String or=k[i];
			
			if(i%2==0)
			{
			String rev="";
			for(int j=or.length()-1;j>=0;j--)
			{
				rev=rev+or.charAt(j);
			}
			
			System.out.print(rev+ " ");
			}
			else
			{
				System.out.print(or+ " ");
			}
		
	}
	}
}
