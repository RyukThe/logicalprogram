package Prime_number;

public class Class9
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
		
	}

}
