package Evene_odd;

import java.util.Scanner;

public class odd_even 
{
public static void main(String[] args)
{
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter no: ");
	int num = scan.nextInt();   //5             //accept int input from user

	// 5%2=  1==0
	if (num % 2 == 0)
	{
		
		System.out.println("given number is even");
	} 
	else 
	{
		System.out.println("given number is odd");
	}
	
	
	
	
	// find even no from 1 to 100
	
}
}