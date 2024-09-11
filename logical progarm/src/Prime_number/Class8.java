package Prime_number;

public class Class8 
{
	public static void main(String[] args)
	{
		int o= 97;
		int count =0;
		
		for(int i=2;i<o;i++)
		{
			if(o%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is  prime ");
		}
		
	}

}
