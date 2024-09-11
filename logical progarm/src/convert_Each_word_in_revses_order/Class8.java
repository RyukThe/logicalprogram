package convert_Each_word_in_revses_order;

public class Class8 
{
	public static void main(String[] args)
	{
		String s="the history of the page they are working on or preview the Web page before publishing it. ";
		String l[]=s.split(" ");
		
		for(int i=0;i<=l.length-1;i++)
		{
			String o=l[i];
			String rev="";
			for(int j=o.length()-1;j>=0;j--)
			{
				rev=rev+o.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}

}
