package Hash_Map_Occurrence_ofcword_and_count_duplicate_Word;

import java.util.HashMap;
import java.util.Set;

public class Class12 
{
	public static void main(String[] args)
	{
		
		String sd="The relational data model is a way of organizing data in a database as a series of tables. Each table represents a specific entity or concept, and the columns in the table represent attributes of that entity. Rows in the table represent individual instances of the entity, with each row containing a unique set of attribute values.\r\n"
				+ "\r\n"
				+ "In a relational database, the database schema defines the structure of the database, including the tables, columns, and relationships between them. Keys are used to uniquely identify rows in a table and establish relationships between tables.\r\n"
				+ "\r\n"
				+ "A schema diagram is a visual representation of the database schema, showing the tables and the relationships between them.\r\n"
				+ "\r\n"
				+ "Relational query languages, such as SQL, are used to retrieve and manipulate data in a relational database. There are several types of relational operations, including select, insert, update, and delete, which allow you to retrieve, add, modify, and delete data in the database.\r\n"
				+ "\r\n"
				+ "Attributes are the specific pieces of information that are stored in the columns of a table. Domains are the set of possible values that an attribute can take on.\r\n"
				+ "\r\n"
				+ "CODD's rules are a set of criteria for evaluating the design of a relational database. These rules include requirements for data integrity, data independence, and support for multiple views of the data.\r\n"
				+ "\r\n"
				+ "Relational integrity constraints are rules that are enforced by the database to ensure the integrity and consistency of the data. There are several types of integrity constraints, including key constraints, which enforce the uniqueness of rows in a table, referential integrity constraints, which enforce relationships between tables, entity integrity constraints, which enforce the uniqueness of rows within a table, and domain constraints, which enforce the allowed values for an attribute.\r\n"
				+ "\r\n"
				+ "Relational database design is the process of designing a database to meet the needs of a specific application. Good relational designs are efficient, flexible, and easy to use. One important aspect of relational database design is normalization, which is the process of organizing the data in a way that minimizes redundancy and dependency. Normalization involves dividing the data into smaller tables and establishing relationships between them. There are several normal forms, including first normal form (1NF), second normal form (2NF), and third normal form (3NF), each with its own set of rules for organizing the data.\r\n"
				+ "\r\n"
				+ "To convert an ER diagram to a relational database, you can start by identifying the entities in the ER diagram and creating tables for each entity. You can then identify the attributes of each entity and create columns in the corresponding table for those attributes. Finally, you can identify the relationships between the entities and use foreign keys to establish those relationships in the database.\r\n"
				+ "\r\n"
				+ "Case Study: For example, let's say you have an ER diagram for a university database with entities for students, courses, and enrollment. You can create tables for each of these entities, with columns for the attributes of each entity (such as student name, course name, and enrollment date). You can then use foreign keys to establish relationships between the tables, such as a student taking multiple courses and a course being taken by multiple students. You can then apply normalization techniques, such as decomposition using functional dependencies, to further refine the design of the database.";
		
				String[] s = sd.split(" ");
				HashMap<String, Integer> mp= new HashMap<String, Integer>();
				for(int i=0;i<=s.length-1;i++)
				{
					String wr=s[i];
					
					if(mp.containsKey(wr))
					{
						mp.put(wr, mp.get(wr)+1);
					}
					else
						
					{
						mp.put(wr, 1);
					}
				}
				
				
				
				Set<String> ssd = mp.keySet();
				for(String k:ssd)
				{
					System.out.println(k+":"+mp.get(k));
				}
				
				
				
				System.out.println("--------------------------------------------");
				
				for(String sdd:ssd)
				{
					if(mp.get(sdd)>1)
					{
						System.out.println(sdd+":"+mp.get(sdd));
					}
				}
	}
	
	
	

}
