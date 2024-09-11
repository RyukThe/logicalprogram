package convert_Each_word_in_revses_order;

public class example1_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";    //ym eman  si cba
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		//                   4<=3        
		for(int i=0; i<=ar.length-1; i++)      //
		{				//          2
			String org = ar[i];  //  abc
			
			String rev="";                   
			for(int j=org.length()-1; j>=0; j--) 
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");   //ym  eman si cba
		}
		
	}

}
