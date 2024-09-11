package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Class15
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> k= new HashMap<Integer, String>();
		k.put(12, "hello");
		k.put(45, "Saurav");
		k.put(123, "Sakik");
		k.put(135, "Sakila");
		k.put(1354, "Taquila");
		System.out.println(k.size());
		System.out.println(k.get(45));
		System.out.println(k.containsKey(12));
		System.out.println(k.containsValue("Taquila"));
		System.out.println("------------------------------------------");
		System.out.println();
		
			Collection<String> v = k.values();
			for(String O:v)
			{
				System.out.println(O);
			}
			
			System.out.println("-----------------------------------------------------");
			
		Set<Integer> sd = k.keySet();
		for( Integer l:sd)
		{
			System.out.println(l);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println();
		for( Integer kq:sd)
		{
			System.out.println(kq+ " :"+ k.get(kq));
		}
	}

}
