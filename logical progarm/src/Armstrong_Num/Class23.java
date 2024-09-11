package Armstrong_Num;

public class Class23 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=1000;i++)
		{
			int sum=0;
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			
			if(sum==i)
			{
			System.out.println(i);
			}
		}
		
		
		System.out.println("============================================================");
	
		int a=153;
		int sum=0;
		
		for(int i=a;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==a)
		{
		System.out.println("Armstorng ");
		}
		else
		{
			System.out.println("not arstorng");
		}
	
	}

}
