package collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHaspMap {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String>data=new LinkedHashMap<Integer, String>();
		data.put(10, "Ajith");
		data.put(12, "Dulquer");
		data.put(9,"Kamal");
		data.put(01,"Surya");
		
		
		System.out.println(data);
		
		Object b=data.clone();
		
		System.out.println(b);
		
		Set s=data.entrySet();
		
		System.out.println(s);
		
		data.forEach((r,n)->System.out.println("The Rank of the actor-->"+r+" The Actor Name is "+n));
		
		Iterator<Entry<Integer, String>>it=data.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Iterator<Integer>it1=data.keySet().iterator();
		while(it1.hasNext())
		{
			System.out.println(data.get(it1.next()));
		}
		
		System.out.println(data.get(1));
		data.clear();
		System.out.println(data);
		System.out.println(data.isEmpty());
		

	}

}
