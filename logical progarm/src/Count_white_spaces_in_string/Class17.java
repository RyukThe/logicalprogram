package Count_white_spaces_in_string;

public class Class17
{
	public static void main(String[] args)
	{
		String m= "HE L O O O oo oO o O O O ooO o ";
		int count=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<=m.length()-1;i++)
		{
			char md=m.charAt(i);
			if(md==' ')
			{
				count++;
			}
			else if(md=='O')
			{
				count1++;
			}
			else if(md=='o')
			{
				count2++;
			}
		}
		
		System.out.println(count+ " spaces are present  in given string ");
		System.out.println();
		System.out.println(count1+ " O are present in given string ");
		System.out.println();
		System.out.println(count2+ " o are present in given string ");
		System.out.println();
		
		System.out.println((count+count1+count2)+ " char are present in given string ");
		
	}

}
