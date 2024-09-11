package Evene_odd;

import java.util.Scanner;

public class Class14
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter number:");
		int num1 = m.nextInt();
		
		
		if(num1%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}

}
