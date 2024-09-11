package reverse_Number_by_witout_converting_String;

public class Class21 
{
	public static void main(String[] args) 
	{
		int o=145454;
		int rev=0;
		
		for(int i=o;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		
		System.out.println(rev);
		
		int i=457878;
		String or=Integer.toString(i);
		String rev1="";
		
		for(int j=or.length()-1;j>=0;j--)
		{
			rev1=rev1+or.charAt(j);
		}
		
		
		int revs = Integer.parseInt(rev1);
		System.out.println(revs);
	}


}
