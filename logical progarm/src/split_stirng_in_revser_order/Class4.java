package split_stirng_in_revser_order;

public class Class4
{
	public static void main(String[] args) 
	
	{
		String l= "Wikipedia, the free encyclopedia";
		String ar[]=l.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
