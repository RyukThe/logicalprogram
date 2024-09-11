package reverse_Number_by_witout_converting_String;

public class Class20 
{
	public static void main(String[] args) 
	{
		int k=854578;
		int revn=0;
		for(int i=k;i>0;i=i/10)
		{
			int rem=i%10;
			revn=revn*10+rem;
		}
		
		System.out.println(revn);
	}

}
