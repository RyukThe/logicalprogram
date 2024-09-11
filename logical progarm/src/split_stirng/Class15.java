package split_stirng;

public class Class15
{
	public static void main(String[] args)
	{
		String s= "Wikipedia, the free encyclopedia";
		
		String ar[]=s.split(" ");
		
		System.out.println(ar[3]);
		
		for(int i= 0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
