package Hash_Map_Occurrence_ofchar_and_count_duplicate_char;

import java.util.HashMap;
import java.util.Set;

public class Class6
{

	public static void main(String[] args)
	{
		String k= "a Hashmap is a Map data structure. Like a list each item that is stored in a hashmap is stored at a particular index. This index is called a hash and it is generated using a hash function.\r\n"
				+ "\r\n"
				+ "Hash functions accept the object to be stored as an argument and generate a number that is unique to it. different hashing functions have different trade-offs. a function that is too sparse will use up more space than required. while one that is not sparse enough will suffer from collisions where objects use the same hash.";
		HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(int i=0;i<=k.length()-1;i++)
		{
			char ch = k.charAt(i);
			
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
			
		}
		
		
		Set<Character> ds = mp.keySet();
		
		for(Character l:ds)
		{
			System.out.println(l+" : "+mp.get(l));
		}
		System.out.println("______________________________________________________________");
		
		for( Character kl:ds)
		{
			if(mp.get(kl)>1)
			{
				System.out.println(kl+":"+mp.get(kl));
				
			}
		
		}
		

	}
}
