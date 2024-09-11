package Evene_odd;

import java.util.Scanner;

public class Class8 
{
	 public static void main(String[] args)
	 {
		 Scanner m = new Scanner(System.in);
		 System.out.println("Enter number");
		 int num = m.nextInt();
		 int count=0;
		 int count1=0;
		
		 if(num%2 ==0)
		 {
			 System.out.println("Given number is even ");
		 
		 for(int i = 1;i<=num;i++)
		 {
			 if(i%2 ==0)
			 {
				 System.out.println(i);
				 count++;
				 
			 }
			 
		 }
		 
		 System.out.println("Toatl even number :"+ count );
		 }
		 else
		 {
			 System.out.println("given number is odd");
			 for(int i=1;i<=num;i++)
			 {
				if(i%2 !=0)
				 {
					 System.out.println(i);
				 count1++;
				 }
			 }
			 System.out.println("total odd numbers: " + count1);
			
		 }
		 
		
		 

	 }
}