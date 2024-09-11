package Evene_odd;

import java.util.Scanner;

public class Class5 
{
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = o.nextInt();
		int m=0;
		
		for(int i=1;i<=num;i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
				m++;
			}
		}
		
		System.out.println("all odd nummber in between 1 to "+(num) + " "+ " is "+" "+(m));
	}

}
