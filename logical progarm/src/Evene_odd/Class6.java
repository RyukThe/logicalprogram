package Evene_odd;

import java.util.Scanner;

public class Class6 
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enetr number");
		int num = m.nextInt();
		
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
				count++;
				
			}
			
			
			
			
		}
		
		
		System.out.println("there are "+ (count)  + " numbers are between  1 to "+ num);
		

		
	}

}
