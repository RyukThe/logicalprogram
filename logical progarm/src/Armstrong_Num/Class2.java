package Armstrong_Num;

public class Class2 
{
	public static void main(String[] args) 
	{
		int o=153;
		int sum=0;
		
		for(int i=o;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		
		if(sum==o)
		{
			System.out.println("Given number is ArmStrog number");
		}
		else
			
		{
			System.out.println("given number is not armstrong number");
		}
	}

}
