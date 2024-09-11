package reverse_Number_by_witout_converting_String;

public class Class11 
{
	public static void main(String[] args) 
	{
		int n=8587451;
		int rn=0;
		for(int i=n;i>0;i=i/10)
		{
			int rem=i%10;
			rn=rn*10+rem;
		}
		
		System.out.println(rn);
		
	}

}
