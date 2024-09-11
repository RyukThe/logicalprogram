package Armstrong_Num;

public class Class11
{
	public static void main(String[] args) 
	{
		int o= 153;
		int sum=0;
		
		for(int i=o;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(o==sum)
		{
			System.out.println("Given number "+ o+ " is armstrong number");
		}
		else
		{
			System.out.println("Given number is "+o+ " is not armstrong " );
		}
		
	}

}
