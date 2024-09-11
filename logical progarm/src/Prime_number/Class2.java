package Prime_number;

import java.util.Scanner;

public class Class2 
{
	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Eneter number:");
		int num =m.nextInt();
		int k=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				k++;
				break;
			}
		}
		
		if(k==1)
		{
			System.out.println("Given number is not  prime number ");
		}
		else
		{
		System.out.println("Given number is prime ");
		}

}
}