package Armstrong_Num;

import java.util.Scanner;

public class Class111
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			int sum= 0;
			for(int j=i;j>0;j=j/10)
			{
				int rem =j%10;
				sum=sum+(rem*rem*rem);
						
			}
			
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		
		
		
		System.out.println("----------------------------");
		Scanner n = new Scanner(System.in);
		System.out.println("enter number");
		int sd = n.nextInt();
		int sum=0;
		for(int i=sd;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==sd)
		{
			System.out.println("given number "+sd+" is aramstrong ");
		}
		else
		{
			System.out.println("not armsrtong");
		}
	}

}
