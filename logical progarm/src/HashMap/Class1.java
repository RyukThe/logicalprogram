package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(101, "Saurav");
		obj.put(102, "OM");
		obj.put(103, "Roy");
		obj.put(105, "Mikku");
		obj.put(102, "Shelby");
		System.out.println(obj);
		
		System.out.println(obj.containsKey(101));
		System.out.println(obj.get(104));
		
		System.out.println("----------------------------------");
		
		Set<Integer> alkey = obj.keySet();
		for(Integer key: alkey)
		{
			System.out.println(key);
		}
		
		
		System.out.println("--------------------------------------");
		
		for(Integer key:alkey)
		{
			System.out.println(key+" : "+obj.get(key) );
		}
	}

}
