package palindrome_String_;

import java.util.Scanner;

public class Class4 
{
	  public static void main(String[] args) 
	  {
		
		  Scanner m = new Scanner(System.in);
		  System.out.println("enter String value:");
		  String str = m.next();
		  
		  String Rev= "";
		  
		  for(int i=str.length()-1;i>=0;i--)
		  {
			  Rev=Rev+str.charAt(i);
		  }
		  
		  System.out.println("String is :" + str);
		  System.out.println("Reverse String is :" + Rev);
		  
		  if(str.equals(Rev))
		  {
			  System.out.println("Entered String is Palindrome");
		  }
		  else
		  {
			  System.out.println("Entered String is Not Palindrome ");
		  }
	  }
}
