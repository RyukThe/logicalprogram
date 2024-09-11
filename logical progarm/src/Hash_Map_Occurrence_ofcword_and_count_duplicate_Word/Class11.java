package Hash_Map_Occurrence_ofcword_and_count_duplicate_Word;

import java.util.HashMap;
import java.util.Set;

public class Class11 
{
	public static void main(String[] args)
	{
		String S="In addition to the concepts I mentioned earlier, there are a few more key concepts to understand when working with the relational data model:\r\n"
				+ "\r\n"
				+ "Indexes: An index is a data structure that allows you to quickly search and retrieve data from a table. Indexes can be created on one or more columns in a table and can be used to improve the performance of queries.\r\n"
				+ "\r\n"
				+ "Stored procedures: A stored procedure is a pre-compiled collection of SQL statements that can be executed as a single unit. Stored procedures can be used to improve the performance of complex queries and to encapsulate business logic.\r\n"
				+ "\r\n"
				+ "Triggers: A trigger is a special type of stored procedure that is automatically executed in response to a specific event, such as the insertion, update, or deletion of a row in a table. Triggers can be used to enforce business rules or to perform additional actions when data is modified.\r\n"
				+ "\r\n"
				+ "Transactions: A transaction is a group of SQL statements that are executed as a single unit. Transactions ensure that either all of the statements are executed successfully, or none of them are executed at all. This helps to maintain the integrity of the data in the database.\r\n"
				+ "\r\n"
				+ "Data warehousing: A data warehouse is a database designed for fast querying and analysis of large amounts of data. Data warehouses are typically optimized for read-only queries and are used for business intelligence and data analytics.\r\n"
				+ "\r\n"
				+ "Big data: Big data refers to extremely large datasets that cannot be processed using traditional database technologies. Big data requires specialized technologies, such as Hadoop, to store, process, and analyze.\r\n"
				+ "\r\n"
				+ "Understanding these concepts is important for working with the relational data model and using a DBMS effectively. By mastering these concepts, you will be able to design, create, and manage relational databases in a way that is efficient, accurate, and secure.";
			String s[]=S.split(" ");
			
			HashMap<String , Integer> mp= new HashMap<String, Integer>();
			 for(int i=0;i<=s.length-1;i++)
			 {
				 String ss=s[i];
				 if(mp.containsKey(ss))
				 {
					mp.put(ss, mp.get(ss)+1);
					 }
					 else
					 {
						 mp.put(ss, 1);
					 }
					 
				 }
			 
			 
			Set<String> keyaq = mp.keySet();
			for(String kl:keyaq)
			{
				System.out.println(kl+" : "+mp.get(kl));
			}
			
			System.out.println("-------------------------------------------------------------");
				 
			for(String kl:keyaq)
			{
				if(mp.get(kl)>1)
				{
					System.out.println(kl+" : "+mp.get(kl));
				}
			}
			
			
			 }
			 
			 
			 
	}


