package Array_Equals;

import java.util.Arrays;

public class Class13 
{
	public static void main(String[] args)
	{
		int a[]= {54,89,96};
		int b[]= {54,89,54};
		int c[]= {54,89,96};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, a));
		
		
		
		
	}
		
	

}
