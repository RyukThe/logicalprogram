package Prime_number;

public class Class214 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
		}
		
		
		System.out.println("=================================================================");
		
		
		int i =5;
		int count=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			
		}
		else
		{
			System.out.println("given number is prime");
		}
	}

}
