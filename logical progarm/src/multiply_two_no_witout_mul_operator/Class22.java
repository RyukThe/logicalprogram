package multiply_two_no_witout_mul_operator;

import java.util.Scanner;

public class Class22
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr number 1");
		int num1 = sc.nextInt();
		System.out.println("Eenter number 2");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num1;i++)
		{
			sum=sum+num2;
		}
		
		System.out.println("mul="+ sum);
	}

}
