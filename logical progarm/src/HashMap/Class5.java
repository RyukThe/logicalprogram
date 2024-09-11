package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class5
{
	public static void main(String[] args)
	{
		HashMap<String , Integer> l= new HashMap<String, Integer>();
		l.put("saurav", 1);
		l.put("Hello", 2);
		l.put("Saurav", 3);
		l.put("sauraV", 4);
		
		System.out.println(l);
		
		System.out.println(l.containsKey("Saurav"));
		System.out.println(l.get("Saurav"));
		
		System.out.println("---------------");
		Set<String> ke = l.keySet();
		for( String o:ke)
		{
			System.out.println(o);
		}
		
		System.out.println("----------------------------------");
		
		for(String key:ke)
		{
			System.out.println(key+" :"+ l.get(key));
		}
		
	}

}
