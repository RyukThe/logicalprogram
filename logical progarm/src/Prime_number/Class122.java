package Prime_number;

public class Class122 
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
		
		
		int sd=5;
		int count=0;
		for(int i=2;i<sd;i++)
		{
			if(sd%i==0)
			{
				count++;
				break;
				
			}
		}
		
		if(count==1)
		{
			System.out.println("number is not  prime");
		}
		else
		{
			System.out.println("prime");
		}
		

	}
}
