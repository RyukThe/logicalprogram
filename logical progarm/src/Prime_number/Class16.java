package Prime_number;

import java.util.Scanner;

public class Class16
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=m.nextInt();
		
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}

}
