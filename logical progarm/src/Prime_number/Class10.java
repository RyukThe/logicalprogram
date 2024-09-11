package Prime_number;

public class Class10
{
	public static void main(String[] args)
	{
		int k=61;
		int count=0;
		
		for(int i=2;i<k;i++)
		{
			if(k%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given number "+k+" is not prime number ");
		}
		else
		{
			System.out.println(" Given number " +k+" is prime number");
		}
	}

}
