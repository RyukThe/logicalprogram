package reverse_even_index_;

public class Class12
{
	public static void main(String[] args) 
	{
		String s="SA kd f f sd sd sd";
		String sn[]=s.split(" ");
		for(int i=0;i<=sn.length-1;i++)
		{
			String or=sn[i];
			
			if(i%2==0)
			{
				String rev="";
				for(int j=or.length()-1;j>=0;j--)
				{
					rev=rev+or.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(or+ " ");
			}
		}
		
	}

}
