package Reverse_String;

public class Class19 
{
	public static void main(String[] args) 
	{
		String k= "Karafton";
		String rev = "";
		
		for(int i = k.length()-1;i>=0;i--)
		{
			rev=rev+k.charAt(i);
		}
		
		System.out.println("Original String :"+ k);
		System.out.println("Reverse String :"+ rev);
		
	}

}
