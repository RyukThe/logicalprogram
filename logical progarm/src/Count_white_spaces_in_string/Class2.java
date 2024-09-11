package Count_white_spaces_in_string;

import java.util.Scanner;

public class Class2 
{
	public static void main(String[] args) 
	{
//		Scanner m = new Scanner(System.in);
//		System.out.println("Enetr String ");
		String k ="hello my name is Saurav";
		
		int count=0;
		
		for(int i=k.length()-1;i>=0;i--)
		{
			char ch=k.charAt(i);
			
			if(ch==' ')
			{
				count++;
			}
		}
		
		System.out.println(count +" spaces are present in given string ");
		
	}

}
