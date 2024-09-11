package Reverse_String;

public class Class1 
{
	public static void main(String[] args) 
	{
		String s="Saurav";
		String rev="";
		
	for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
	}
	
		System.out.println(s);
		System.out.println(rev);
//		StringBuffer mm= new StringBuffer(s);
//		
//		StringBuffer r = mm.reverse();
//		System.out.println(mm.reverse());
	}

}
