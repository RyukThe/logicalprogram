package Armstrong_Num;

public class Class5 
{
	public static void main(String[] args) 
	{
		
	
	for(int i=1;i<=10000;i++)
	{
		int sum =0;
		int temp=i;
		for(;temp>0;temp=temp/10)
		{
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==i)
		{
			System.out.println(i);
		}
	}

	}
}