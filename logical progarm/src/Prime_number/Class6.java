package Prime_number;

public class Class6 
{
	public static void main(String[] args)
	{
		int s=53;
		int count=0;
		for(int i=2;i<s;i++)
		{
			if(s%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given number  "+s+" is not prime");
		}
		else
		{
			System.out.println("given number "+s+" is prime number");
		}
	}

}
