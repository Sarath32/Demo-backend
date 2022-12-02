package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		List<String>data=new ArrayList<String>();
		
		data.add("Spring");
		data.add("Spring Boot");
		data.add("Java");
		data.add("Java Script");
		data.add("React");
		
		System.out.println(data);
		System.out.println(data.size());
		System.out.println(data.indexOf("React"));
		System.out.println(data.get(4));
		System.out.println("<----- While Loop ----->");
		
		
		int i=0;
		while(i<data.size())
		{
			System.out.println(data.get(i));
			i++;
		}
		
		System.out.println("<----- For Loop ----->");
		
		for(i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
 
		System.out.println("<----- For each Loop ----->");
		
		for (String str : data) {
			
			System.out.println(str);
		}
		
		System.out.println("<----- Iterator Loop ----->");
		
		Iterator<String>it=data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
			}

}
