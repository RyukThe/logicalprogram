package Hash_Map_Occurrence_ofcword_and_count_duplicate_Word;

import java.util.HashMap;
import java.util.Set;

public class Class8
{
	public static void main(String[] args) 
	{
		String wor="In computing, a hash table, also known as hash map, is a data structure that implements an associative array or dictionary. It is an abstract data type that maps keys to values";
		 String[] sd = wor.split(" ");
		 
		 HashMap<String , Integer> mp= new HashMap<String, Integer>();
		 
		 for(int i=0;i<=sd.length-1;i++)
		 {
			 String ke=sd[i];
			 
			 if(mp.containsKey(ke))
			 {
				 mp.put(ke, mp.get(ke)+1);
			 }
		 
			 else
			 {
				 mp.put(ke, 1);
			 }
		 }
		
		 
		Set<String> sds = mp.keySet();
		
		for( String o:sds)
		{
			System.out.println(o+" : "+ mp.get(o));
		}
		
		System.out.println("-------------------------------------------------------");
		
		for(String k:sds)
		{
			if(mp.get(k)>1)
			{
				System.out.println(k+" : "+ mp.get(k));
			}
		}
	}

}
