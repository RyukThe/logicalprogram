package Hash_Map_Occurrence_ofchar_and_count_duplicate_char;

import java.util.HashMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Class10 
{
	public static void main(String[] args)
	{
		String s="Saurav is my name";
		
		HashMap< Character, Integer> mp= new HashMap<>();
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			
			if(mp.containsKey(c))
			{
				mp.put( c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
			Set<Character> alkey = mp.keySet();
			
			for(Character key:alkey)
			{
				System.out.println(key+":"+mp.get(key));
			}
			
			System.out.println("-----------------------------------------------------------------------");
			
			
			for( Character key:alkey)
			{
				if(mp.get(key)>1)
				{
				System.out.println(key+":"+mp.get(key));
				}
			}
				
		
		
	}

}
