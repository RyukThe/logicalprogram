package Count_white_spaces_in_string;

public class Class16 
{
	public static void main(String[] args) 
	{
		String s= "1 2 3 4 5";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char s1=s.charAt(i);
			if(s1 ==' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
