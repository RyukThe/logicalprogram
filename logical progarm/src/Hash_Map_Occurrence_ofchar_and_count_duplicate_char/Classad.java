package Hash_Map_Occurrence_ofchar_and_count_duplicate_char;

import java.util.HashMap;
import java.util.Set;

public class Classad 
{
	public static void main(String[] args) 
	{
		String sd="hello sd Ryuk";
		
		HashMap< Character, Integer> mp = new HashMap<Character, Integer>();
		for(int i=0;i<=sd.length()-1;i++)
		{
			char sda = sd.charAt(i);
			if(mp.containsKey(sda))
			{
				mp.put(sda, mp.get(sda)+1);
			}
			else
			{
				mp.put(sda, 1);
			}
		}
		
		
		Set<Character>ch=mp.keySet();
		for(Character K:ch)
		{
			System.out.println(K+":"+mp.get(K));
			
		}
		
		System.out.println("===================================");
		for(Character s:ch)
		{
			if(mp.get(s)>1)		
			{System.out.println(s+":"+mp.get(s));
			}
			}
		}
	

}
