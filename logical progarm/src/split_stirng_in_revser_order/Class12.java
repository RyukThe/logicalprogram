package split_stirng_in_revser_order;

public class Class12 
{
	public static void main(String[] args)
	{
		String s1="my name is abc";    //
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		System.out.println("------------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
