package convert_Each_word_in_revses_order;

public class example2_ReverseEachWordInStatement22 
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";    //ym eman  si cba
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		for(int i=0; i<=ar.length-1; i++)      //
		{				//      1
			String org = ar[i];  //  name
			String rev=reverseString(org);      //name --> eman
			
			System.out.print(rev+" ");   //ym eman
		}
	}
	
	
	public static String reverseString(String org) 
	{
		String rev="";                   
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
		}
		return rev;
	}
	
	

}
