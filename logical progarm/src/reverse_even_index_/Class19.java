package reverse_even_index_;

public class Class19 
{
	public static void main(String[] args) 
	{
		String po="kfh kf h hjgjgj gj jhgjg jh";
		String []io=po.split(" ");
		
		for(int i=0;i<=io.length-1;i++)
		{
			String o=io[i];
			
			if(i%2!=0)
			{
				String rev="";
				for(int j=o.length()-1;j>=0;j--)
				{
					rev=rev+o.charAt(j);
				}
				System.out.print(rev+ " ");
			}
			else
			{
				System.out.print(o+" ");
			}
		}
		
	}

}
