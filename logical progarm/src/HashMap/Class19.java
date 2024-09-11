package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class19 
{
	public static void main(String[] args) 
	{
		HashMap<Character, String> ob= new HashMap<Character, String>();
		ob.put('a', "Saurav");
		ob.put('b', "monk");
		ob.put('c', "Lust");
		ob.put('k', "Sal");
		ob.put('k', "Shelby");
		System.out.println(ob);
		System.out.println(ob.containsKey('c'));
		System.out.println(ob.containsValue("Saurav"));
		
		System.out.println("--------------------------------------------");
		
		Set<Character> ol = ob.keySet();
		for( Character k:ol)
		{
			System.out.println(k);
		}
		
		System.out.println("-----------------------------------");
	
	
		for( Character k:ol)
		{
			System.out.println(k+" : "+ ob.get(k));
		}
	
	}

}
