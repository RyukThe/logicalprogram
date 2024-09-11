package Reverse_String;

public class class5
{
	public static void main(String[] args)
	{
		String h= "World";
		String rev= "";
		
		for(int i =h.length()-1;i>=0;i--)
		{
			rev=rev+h.charAt(i);
		}
		
		System.out.println();
		System.out.println("Original String "+ h);
		System.out.println("Reverse String is :"+ rev);
	}

}
