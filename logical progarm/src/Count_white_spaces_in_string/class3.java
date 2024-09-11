package Count_white_spaces_in_string;

import java.util.Scanner;

public class class3 
{
	public static void main(String[] args) 
	{
		Scanner m= new Scanner(System.in);
		System.out.println("Enetr String ");
		String str = m.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char s=str.charAt(i);
			if(s==' ')
			{
				count++;
			}
		}
		
		System.out.println(count+" spaces are availabe in given string ");
		
	}

}
