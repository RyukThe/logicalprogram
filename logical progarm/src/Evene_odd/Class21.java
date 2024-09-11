package Evene_odd;

public class Class21
{
	public static void main(String[] args) 
	{
		int a= 2;
		
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		
		m1();
		System.out.println("----------------------------------------------------------");
		m2();
	}
	
	
	
	public static void m1()
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
				
			}
			
			
		}
		
		System.out.println(count);
	}
	
	public static void m2()
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count );
	}
	

}
