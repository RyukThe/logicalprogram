package Factorial;

import java.util.Scanner;

public class Class19
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enetr number :");
		int n=m.nextInt();
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of " + n+ "is " + fact);
	}

}
