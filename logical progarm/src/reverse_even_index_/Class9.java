package reverse_even_index_;

public class Class9
{
	public static void main(String[] args) 
	{
		String s= "My Name is Saurav";
		String [] ar=s.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			
			if(i%2==0)
			{
				String rev="";
				for(int j=org.length()-1;j>=0;j--)
				{
					rev=rev+org.charAt(j);
					
				}
				
				System.out.print(rev+ " ");
			}
			else
			{
				System.out.print(org+ " ");
			}
			
			
		}
		
	}

}
