package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class6
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> k= new HashMap<Integer, String>();
		k.put(1, "Saurav");
		k.put(2, "Jira");
		k.put(12, "Visible");
		k.put(13, "google");
		k.put(12, "newton");
		k.put(101, "Viking");
		System.out.println(k);
		System.out.println(k.get(12));
		System.out.println(k.containsKey(1));
		System.out.println(k.containsValue("Saurav"));
		System.out.println(k.values());
		System.out.println("_________________________________________");
		
		Set<Integer>ke=k.keySet();
		for( Integer o:ke)
		{
			System.out.println(o);
		}
		
		System.out.println("---------------------------------------------");
	
	
		for(Integer kl: ke)
		{
			System.out.println(kl+" :" + k.get(kl));
		}
	
	
	}
	

}
