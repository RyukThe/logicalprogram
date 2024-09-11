package convert_Each_word_in_revses_order;

public class Class1 
{
	public static void main(String[] args)
	{
		String s="I love my India";
		String ar[]=s.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			
			String rev="";
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
			}
			
			System.out.print(rev+ " ");
		}
		
	}

}
