package reverse_even_index_;
public class example1_ReverseEvenOrOddIndexWordsInStatement3
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";    //
		String [] ar=s1.split(" ");  //{my(0)  name(1)    is(2)    abc(3)}
		
		//                  4<=3
		for(int i=0; i<=ar.length-1; i++)
		{			             
			String org = ar[i];  //abc
		
			//3%2=1==0
			if(i%2==0)
			{
				String rev = reverseString(org);   //
				System.out.print(rev+" ");      // 
			}
			else
			{
				System.out.print(org+" ");      // 
			}
		}		
	}
	
	//ym name si abc
	
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
