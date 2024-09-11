package Factorial;

import java.util.Scanner;

public class Class13 
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enetr number ");
		int num=n.nextInt();
		
		int fact= 1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		
		System.out.println("factorial of " + num +" is "+ fact);
	}

}
