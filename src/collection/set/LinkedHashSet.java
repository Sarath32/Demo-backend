package collection.set;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet{

	public static void main(String[] args) {

		Set<String>names=new java.util.LinkedHashSet<String>();
		
		names.add("Robb Strak");
		names.add("Theon Greyjoy");
		names.add("Robert baratheon");
		
		for (String str : names) {
			System.out.println(str);
		}
		
		Iterator<String>it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

		System.out.println(names.size());
		System.out.println(names);
		
		
		System.out.println(names.contains("Robb Strak"));
		names.clear();
		System.out.println(names);
		System.out.println(names.isEmpty());
		
	
		
	}

}
