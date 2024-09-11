package reverse_Number_by_witout_converting_String;

public class Class18 
{
	public static void main(String[] args)
	{
		int o=54545851;
		int rn=0;
		for(int i=o;i>0;i=i/10)
		{
			int rem=i%10;
			rn=rn*10+rem;
		}
		
		System.out.println(rn);
		
		
		
		int or2=87451236;
		 String Str = Integer.toString(or2);
		 String rev="";
		 
		 int j=Str.length()-1;
		 while(j>=0)
		 {
			 
			 rev=rev+Str.charAt(j);
			 j--;
			 
		 }
		 
		 
		 int rn2=Integer.parseInt(rev);
		 System.out.println(rn2);
	}

}
