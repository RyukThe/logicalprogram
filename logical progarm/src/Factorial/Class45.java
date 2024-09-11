package Factorial;

public class Class45 
{
	public static void main(String[] args) 
	{
		int a=5;
		int fact =1;
		for(int i=a;i>=1;i--)
		{
			fact = fact*i;
		}
		
		
		System.out.println(fact);
	
	
		int s= 8754124;
		int rev=0;
		for(int i=s;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		
		
		System.out.println(rev);
		
		
		System.out.println("------------------------------------------");
		
		
		String strin = Integer.toString(rev);
			String rev1="";
			for(int i=strin.length()-1;i>=0;i--)
			{
				rev1=rev1+strin.charAt(i);
			}
			
			
		int ints = Integer.parseInt(rev1);
		System.out.println(ints);
			
		
	}
	
	
	


}
