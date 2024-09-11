package reverse_Number_by_witout_converting_String;

public class Class16 
{
	public static void main(String[] args) 
	{
		int o= 45454521;
		int nur=0;
		for(int i=o;i>0;i=i/10)
		{
			int rem = i%10;
			nur=nur*10+rem;
		}
		
		System.out.println(nur);
		
	}

}
