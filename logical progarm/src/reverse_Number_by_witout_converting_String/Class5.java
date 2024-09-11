package reverse_Number_by_witout_converting_String;

public class Class5 
{
	public static void main(String[] args) 
	{
		int num=170;
		int revNum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);
		
	}

}
