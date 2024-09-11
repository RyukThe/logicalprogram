package multiply_two_no_witout_mul_operator;

import java.util.Scanner;

public class Class3
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enetr number1 :");
		int no1=m.nextInt();
		System.out.println("Enetr no2:");
		int no2= m.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=no2;i++)
		{
			sum=sum+no1;
		}
		
		System.out.println("multiplication of "+ no1+ " and "+ no2 + " is "+ sum);
	}

}
