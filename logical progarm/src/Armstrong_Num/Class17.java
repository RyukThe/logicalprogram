package Armstrong_Num;

import java.util.Scanner;

public class Class17 
{
	public static void main(String[] args)
	{
		Scanner  k= new Scanner(System.in);
		System.out.println("Eneter Numebr");
		int orgNum=k.nextInt();
		int sum=0;
		
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		
		
		if(orgNum==sum)
		{
			System.out.println("Given number " +orgNum+" is Armstrong number");
		}
		else
		{
			System.out.println("Given number is  " +orgNum+"Not Armstorng number ");
		}
	}

}
