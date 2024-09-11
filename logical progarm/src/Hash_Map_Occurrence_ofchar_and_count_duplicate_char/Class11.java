package Hash_Map_Occurrence_ofchar_and_count_duplicate_char;

import java.util.HashMap;
import java.util.Set;

public class Class11 
{

	public static void main(String[] args)
	{
		String s="Ok Google";
		HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
		}
		
		
		Set<Character> sd = mp.keySet();
		for( Character ke:sd)
		{
			System.out.println(ke+" : "+ mp.get(ke));
		}
		
		
		
		System.out.println("___________________________________________________");
	
	
	
		for( Character dk:sd)
		{
			if(mp.get(dk)>1)
			{
			System.out.println(dk+": "+ mp.get(dk));
			}
		}
	
	}
	
}
