package Factorial;

import java.util.Scanner;

public class Class7
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Eneter number");
		int num = m.nextInt();
		
		int fact = 1;

		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		
		System.out.println(fact);
		
	}

}
