package reverse_Number_by_witout_converting_String;

public class Class8 
{
	public static void main(String[] args)
	{
		int o=54545851;
		int rn=0;
		for(int i=o;i>0;i=i/10)
		{
			int rem=i%10;
			rn=rn*10+rem;
		}
		
		System.out.println(rn);
		
	}

}
