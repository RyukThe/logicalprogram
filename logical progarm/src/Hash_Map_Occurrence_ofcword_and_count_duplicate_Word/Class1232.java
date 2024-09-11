package Hash_Map_Occurrence_ofcword_and_count_duplicate_Word;

import java.util.HashMap;
import java.util.Set;

public class Class1232 
{
	public static void main(String[] args)
	{
		String s= "The relational data model is a way of organizing data in a database as a series of tables. Each table represents a specific entity or concept, and the columns in the table represent attributes of that entity. Rows in the table represent individual instances of the entity, with each row containing a unique set of attribute values.\\r\\n";
		 String s1[]= s.split(" ");
		HashMap<String , Integer> mp= new HashMap<String, Integer>();
		
		for(int i=0;i<=s1.length-1;i++)
		{
			String or=s1[i];
			
			if(mp.containsKey(or))
			{
				mp.put(or, mp.get(or)+1);
				
			}
			
			else
			{
				mp.put(or,1);
			}
			
			
			
		}
		 
		
		
		Set<String>sd=mp.keySet();
		for(String o:sd)
		{
			System.out.println(o+":"+mp.get(o));
		}
		
		System.out.println("----==================================----------------");
	
	
		for(String k:sd)
		{
			if(mp.get(k)>1)
			{
				System.out.println(k+":"+mp.get(k));
			}
		}
	
	}
	

}
