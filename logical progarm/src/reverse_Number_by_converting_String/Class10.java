package reverse_Number_by_converting_String;

public class Class10 

{
	public static void main(String[] args)
	{
	 int  d=45454545;
	 String s = Integer.toString(d);
	 
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--) 
	 {
		 rev=rev+s.charAt(i);
		 
	 }
		
	 int revnum=Integer.parseInt(rev);
	 System.out.println(revnum);
	}

}
