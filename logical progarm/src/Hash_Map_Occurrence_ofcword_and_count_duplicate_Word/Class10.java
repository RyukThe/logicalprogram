package Hash_Map_Occurrence_ofcword_and_count_duplicate_Word;

import java.util.HashMap;
import java.util.Set;

public class Class10
{
	public static void main(String[] args) 
	{
		String l= "Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key. (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.\r\n"
				+ "This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets. Iteration over collection views requires time proportional to the \"capacity\" of the HashMap instance (the number of buckets) plus its size (the number of key-value mappings). Thus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.\r\n"
				+ "\r\n"
				+ "An instance of HashMap has two parameters that affect its performance: initial capacity and load factor. The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the hash table is created. The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased. When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.";
				
				String[] word = l.split(" ");
				HashMap<String , Integer> hm=new HashMap<>();
				
				for(int i=0;i<=word.length-1;i++)
				{
					String s=word[i];
					
					if(hm.containsKey(s)) 
					{
						hm.put(s, hm.get(s)+1);
					
					}
					else
					{
						hm.put(s, 1);
					}
				}
				Set<String> keal = hm.keySet();
				for(String key:keal)
				{
					System.out.println(key+" : "+hm.get(key));
				}
				
				System.out.println("--------------------------------------------------------------------");
				
				for(String key:keal)
				{
					if(hm.get(key)>1)
					{
						System.out.println(key+" : "+hm.get(key));
					}
				}
	}

}
