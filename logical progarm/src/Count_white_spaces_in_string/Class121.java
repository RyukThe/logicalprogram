package Count_white_spaces_in_string;

public class Class121 
{
	public static void main(String[] args) 
	{
		String s="Saurav is my name k k k ";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				count++;
				
			}
		}
		
		
		System.out.println(count);
		
	}

}
