package reverse_Number_by_converting_String;

public class Class7 
{
	public static void main(String[] args) 
	{
		int uy=852014659;
		String k= Integer.toString(uy);
		String rev="";
		for(int i=k.length()-1;i>=0;i--)
		{
			rev=rev+k.charAt(i);
		}
		
		int ren = Integer.parseInt(rev);
		System.out.println(ren);
		
	}

}
