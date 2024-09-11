package Count_white_spaces_in_string;

import java.util.Scanner;

public class Class4 
{
	public static void main(String[] args)
	{
		Scanner m =new Scanner(System.in);
		System.out.println("Enetr string ");
		String str = m.nextLine();
		int count =0;
		int count1 =0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char s= str.charAt(i);
			if(s==' ')
			{
				count++;
			}
			else if(s !=' ')
			{
				count1++;
			}
		}
		
		System.out.println(count +" spaces are available in given string ");
		System.out.println(count1+ " other char prsent are");
	}
}
