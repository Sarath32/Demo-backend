package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
	LinkedList<String>data=new LinkedList<String>();
	
	data.add("Spring Boot");
	data.add("java");	
	data.add("c++");	
	data.add("c");
	
	System.out.println(data.size());
	System.out.println(data.get(3));
	System.out.println(data);
	System.out.println(data.indexOf("java"));
	
	
	System.out.println("<-------While loop------>");
	
	int i=0;
	while(i<data.size())
	{
		System.out.println(data.get(i));
		i++;
	}
	
	System.out.println("<-------For Loop------>");
	
	for(i=0;i<data.size();i++)
	{
		System.out.println(data.get(i));
	}
	
	System.out.println("<------For Each----->");
	
	for (String str : data) {
	System.out.println(str);  
	}
	
	System.out.println("<------Iterator----->");
	
	Iterator<String>it=data.iterator();
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
			
	
	
	}

}
