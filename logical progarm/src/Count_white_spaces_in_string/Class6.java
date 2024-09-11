package Count_white_spaces_in_string;

import java.util.Scanner;

public class Class6 
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("enetr string ");
		String str = m.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char f=str.charAt(i);
			if(f==' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count+ " spaces are present in gievn string ");
		
	}

}
