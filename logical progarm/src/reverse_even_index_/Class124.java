package reverse_even_index_;

public class Class124 
{
	public static void main(String[] args) 
	{
		String sds=". There are several types of keys, including primary keys, which are used to uniquely identify each row in a table, and foreign keys, which are used to establish relationships between tables.\r\n"
				+ "\r\n"
				+ "Indexes: An index is a data structure that allows you to quickly search and retrieve data from a table. Indexes can be created on one or more columns in a table and can be used to improve the performance of queries.\r\n"
				+ "\r\n"
				+ "Queries: A query is a request for data from a database. Queries can be used to retrieve, insert, update, or delete data from a database.\r\n"
				+ "\r\n"
				+ "SQL: SQL (Structured Query Language) is the standard language for interacting with relational databases. SQL is used to write queries and manipulate data in the database.\r\n"
				+ "\r\n"
				+ "Normalization: Normalization is the process of organizing a database in a way that minimizes redundancy and dependency. Normalization helps to improve the performance and integrity of a database by ensuring that data is stored in a consistent and efficient way.\r\n"
				+ "\r\n"
				+ "Understanding these concepts is essential for working with databases and using a DBMS effectively. By mastering these concepts, you will be able to design, create, and manage databases in a way that is efficient, accurate, and secure.";
		
		String j[]=sds.split(" ");
		
		for(int i=0;i<=j.length-1;i++)
		{
			String sd=j[i];
			String rev="";
			if(i%2==0)
			{
				
				for(int a=sd.length()-1;a>=0;a--)
				{
					rev=rev+sd.charAt(a);
				}
			System.out.print(rev+" ");
			}
			else
			{
				System.out.print(sd+" ");
			}
			
		}
		
	}

}
