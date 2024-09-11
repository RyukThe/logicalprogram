package Count_white_spaces_in_string;

public class Class88
{
	public static void main(String[] args) 
	{
		String sa="SAs dsd sd s ds d  d d d  d d d  d d d ";
		int count=0;
		for(int i=0;i<=sa.length()-1;i++)
		{
			char s=sa.charAt(i);
			if(s==' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
