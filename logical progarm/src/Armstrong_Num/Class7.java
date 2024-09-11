package Armstrong_Num;

public class Class7
{
	public static void main(String[] args)
	{
		int k=153;
		int sum=0;
		
		for(int i=k;i>0;i=i/10)
		{
			int rem =i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==k)
		{
			System.out.println("given number "+k+" is armstorng number ");
		}
		else
			
		{
			System.out.println("Given number "+k+" is not armstrong number ");
		}
		
	}

}
