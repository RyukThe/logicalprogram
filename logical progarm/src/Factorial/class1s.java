package Factorial;

public class class1s
{
	public static void main(String[] args)
	{
//		int k= 5;
//		int fact=1;
//		
//		for(int i=k;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);
//		
//		
//		
//		
//		int count=0;
//		
//		
//		for(int i=2;i<k;i++)
//		{
//			if(k%i==0)
//			{
//				count++;
//				break;
//			}
//		}
//		
//		
//		if(count==1)
//		{
//			System.out.println("number is not prime");
//		}
//		else
//		{
//			System.out.println("number is prime");
//		}
//	
//	
//	
//			String s="The relational data model is a way of organizing data in a database as a series of tables. Each table represents a specific entity or concept, and the columns in the table represent attributes of that entity. Rows in the table represent individual instances of the entity, with each row containing a unique set of attribute values.\\r\\n";
//			String  s1[]=s.split(" ");
//			
//			for(int i=0;i<=s1.length-1;i++)
//			{
//					String or=s1[i];
//					
//					if(i%2==0)
//					{
//						String rev="";
//					for(int j=or.length()-1;j>=0;j--)
//					{
//						
//						rev=rev+or.charAt(j);
//					}
//				
//						System.out.print(rev+" ");
//					}
//					else
//					{
//						System.out.print(or+" ");
//					}
//					
//					
//					
//			}
//			
//			
			
			for(int i=1;i<=1000;i++)
			{
				int sum=0;
				
				
				for(int j=i;j>0;j=j/10)
				{
					int rem=j%10;
					sum=sum+(rem*rem*rem);
				}
				
				
				
				
				if(sum==i)
				{
					System.out.println(i);
				}
			}
			
			
			
			
			
			for(int i=1;i<=100;i++)
			{
				int count=0;
				
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
					
				}
				
				if(count==0)
				{
					System.out.println(i);
				}
			}
			
			
			for(int i=1;i<=100;i++)
			{
				if(i%2==0)
				{
					System.out.println(i+ " numbre is even");
				}
				else
				{
					System.out.println(i+ " number is odd");
				}
			}
			
			
			
			int i=85543625;
			int rev=0;
			
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				rev=rev*10+rem;
			}
			
			
			System.out.println(rev);
			
			
			
			
			
			
			
	
	}

	
	
	
	
	
}
