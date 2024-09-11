package multiply_two_no_witout_mul_operator;

import java.util.Scanner;

public class class2
{
	public static void main(String[] args)
	{
		
	Scanner m = new Scanner(System.in);
	System.out.println("Enter num 1:");
	int num1 = m.nextInt();
	System.out.println("Enetr num2");
	int num2= m.nextInt();
	
	int sum=0;
	for(int i=1;i<=num1;i++)
	
	{
		sum=sum+num2;
		
	}
	
	System.out.println(sum);
	}
	
}
