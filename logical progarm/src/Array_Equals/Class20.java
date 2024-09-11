package Array_Equals;

import java.util.Arrays;

public class Class20 
{
	public static void main(String[] args) 
	{
		int []p= {45,87,98};
		int [] q= {54,87,89};
		int [] k= {45,87,98};
		System.out.println(Arrays.equals(p, k));
		System.out.println(Arrays.equals(k,q));
		System.out.println(Arrays.equals(q, p));
		
		
	}

}
