package reverse_Number_by_converting_String;

public class Class45
{
	public static void main(String[] args)
	{
		
	
	
	int s=457894;
	int rev=0;
	for(int a=s;a>0;a=a/10)
	{
		int rem=a%10;
		rev=rev*10+rem;
	}
	
	System.out.println(rev);
	}

}
