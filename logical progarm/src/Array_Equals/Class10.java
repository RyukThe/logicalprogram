package Array_Equals;

import java.util.Arrays;

public class Class10
{
	public static void main(String[] args) 
	{
		int [] ar= {10,22,44,66};
		int [] ar1= {12,32,54,66};
		int [] ar2= {12,32,54,66};
		
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.equals(ar, ar2));
		System.out.println(Arrays.equals(ar1, ar2));
	}

}
