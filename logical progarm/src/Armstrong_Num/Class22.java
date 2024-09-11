package Armstrong_Num;

public class Class22 
{
	public static void main(String[] args)
	{
		int k= 153;
		int sum=0;
		for(int i=k;i>0;i=i/10)
		{
			int rem =i%10;
			sum=sum+(rem*rem*rem);
			
		}
		
		
		for(int i=1;i<1000;i++)
		{
			int sum1=0;
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				sum1=sum1+(rem*rem*rem);
			}

			if(sum1==i)
			{
				System.out.println(i);
			}
		}
		
		
		System.out.println("----------------------------------------");
		
		
		
		
		if(sum==k)
		{
			System.out.println("gievn number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		
	}
}
