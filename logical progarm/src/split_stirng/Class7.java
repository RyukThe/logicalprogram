package split_stirng;

public class Class7
{
	public static void main(String[] args)
	{
		String s= "a server program that allows users to collaborate in forming the content of a Web site";
		
		String ar[]=s.split(" ");
		
		System.out.println(ar[3]);
		
		for(int i= 0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
