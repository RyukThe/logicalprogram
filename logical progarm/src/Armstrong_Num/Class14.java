package Armstrong_Num;

import java.util.Scanner;

public class Class14 
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enetr number");
		int num=m.nextInt();
		
		int sum=0;
		
		for(int i =num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
	
		if(sum==num)
		{
			System.out.println("given number "+num+" is armstorng number");
		}
		else
		{
			System.out.println("given number "+num+" is not armstorng");
		}
	}

}
