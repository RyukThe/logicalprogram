package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Class11 
{
	public static void main(String[] args) 
	{
		HashMap<String , String> obj= new HashMap<String, String>();
		
	
		for(int i=0; ;i++)
		{
			System.out.print("Enter key ");
			Scanner m= new Scanner(System.in);
			System.out.println("EnterKey");
			String  k = m.nextLine();
			if(k.equals("q"))
			{
				break;
			}
			System.out.println("enter Value");
			String v = m.nextLine();
			
			obj.put(k, v);
			
		}
		System.out.println(obj);
		
		
		
	
	}

}
