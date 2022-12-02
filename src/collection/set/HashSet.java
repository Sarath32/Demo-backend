package collection.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {

		List<String>data1=new ArrayList<String>();
		data1.add("Cersi Lannister");
		data1.add("Tyrion Lannister");
		data1.add("Jamie Lannister");
		data1.add("Joffrey Lannister");
		
       Set<String>data=new java.util.HashSet<String>();
       
       data.add("Jhon Snow");
       data.add("Denerys");
       data.add("Khal Drogo");
       data.add("Sansa Stark");
       
		System.out.println(data.size());
		
		System.out.println(data);
		
		System.out.println("<<<< Using For Each loop>>>");
		
		for (String str : data) {
			
			System.out.println(str);
		}
		
		System.out.println("<<<< Using For Iterator loop>>>");
		
		Iterator<String>it=data.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// Set Cannot allow the duplicate value
		//Hash Set allow nullset
		
		//Methods Of HashSet
		
		data.clear();
		System.out.println(data);
		
		data.addAll(data1);
		System.out.println(data);
		
		
		System.out.println(data.contains("Jamie Lannister"));
		
		data.remove("Cersi Lannister");
		System.out.println(data);
		
		data.removeAll(data);
		System.out.println(data);
		

		System.out.println(data.isEmpty());
		
		
		

	}

}
