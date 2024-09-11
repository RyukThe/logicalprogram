package reverse_Number_by_converting_String;

public class Class2 
{
	public static void main(String[] args) 
	{
		int k= 855481;
		String s=Integer.toString(k);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		int revnum = Integer.parseInt(rev);
		System.out.println(revnum);
		
	}

}
