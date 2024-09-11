package Armstrong_Num;

public class Class6
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			int sum=0;
		
			for(int temp=i;temp>0;temp=temp/10)
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
