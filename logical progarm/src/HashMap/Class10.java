package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Class10 
{
	public static void main(String[] args)
	{
		HashMap<String,Long> obj= new HashMap<>();
		obj.put("Saurav", 8554807745l);
		obj.put("Ajay", 78458745445l);
		obj.put("Mike", 4784125445l);
		
		System.out.println(obj);
		System.out.println(obj.containsKey("Saurav"));
		System.out.println(obj.get("Ajay"));
		
		System.out.println("---------------------------------");
		
		Set<String> sd = obj.keySet();
		for( String key:sd)
		{
			System.out.println(key);
		}
		
		System.out.println("------------------------------------------");
		
		for(String key:sd)
		{
			System.out.println(key+" : "+obj.get(key));
		}
		
		
	}

}
