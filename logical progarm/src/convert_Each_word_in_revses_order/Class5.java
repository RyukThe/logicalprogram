package convert_Each_word_in_revses_order;

public class Class5 
{
	public static void main(String[] args) 
	{
		String s= "Hello ok bye";
		String sr[]=s.split(" ");
		
		for(int i=0;i<=sr.length-1;i++)
		{
			String or=sr[i];
			String Rev="";
			for(int j=or.length()-1;j>=0;j--)
			{
				Rev=Rev+or.charAt(j);
			}
			
			System.out.print(Rev+ " ");
		}
		
	}

}
