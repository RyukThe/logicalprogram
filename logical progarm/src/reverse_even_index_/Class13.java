package reverse_even_index_;

public class Class13 
{
	public static void main(String[] args) 
	{
		String k="More advanced wikis have a management component that allow a designated person to accept or reject changes";
		String r[]=k.split(" ");
		
		for(int i=0;i<=r.length-1;i++)
		{
			String o=r[i];
			
			if(i%2==0)
			{
				String rev="";
				for(int j=o.length()-1;j>=0;j--)
				{
					rev=rev+o.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(o+" ");
			}
		
		}

}
}
