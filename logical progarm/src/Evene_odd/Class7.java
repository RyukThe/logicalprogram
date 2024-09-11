package Evene_odd;

import java.util.Scanner;

public class Class7 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		System.out.println("enter number ");
		int num=n.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("given number is even ");
			
		}
		else
		{
			System.out.println("given number is odd");
		}
	}
	

}
