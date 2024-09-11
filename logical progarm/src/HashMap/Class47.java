package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class47 
{
	public static void main(String[] args) 
	{
		HashMap< Integer, String> mp= new HashMap<Integer, String>();
		mp.put(1, "Saurav");
		mp.put(13, "SAURAV");
		mp.put(12, "Hello");
		System.out.println(mp.containsKey(12));
		System.out.println(mp.get(12));
		
	System.out.println(mp);
	System.out.println("------------------------------");
	Set<Integer> as = mp.keySet();
	for( Integer k:as)
	{
		System.out.println(k+":"+mp.get(k));
	}
		
	}

}
