package Array_Equals;

import java.util.Arrays;

public class Class15 
{
	public static void main(String[] args)
	{
		int a[]= {54,65,36};
		int b[]= {14,25,36};
		int n[]= {14,56,96};
		int a1[]= {14,25,36};
		System.out.println(Arrays.equals(a, n));
		System.out.println(Arrays.equals(b, a));
		System.out.println(Arrays.equals(b, n));
		System.out.println(Arrays.equals(a1, b));
		
	}

}
