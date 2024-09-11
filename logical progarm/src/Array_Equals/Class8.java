package Array_Equals;

import java.util.Arrays;

public class Class8
{
	public static void main(String[] args) 
	{
		int h[]= {45,96,96};
		int y[]= {87,56,96};
		int k[]= {45,96,96};
		System.out.println(Arrays.equals(h, y));
		System.out.println(Arrays.equals(y, k));
		System.out.println(Arrays.equals(k, h));
		
	}

}
