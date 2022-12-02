package collection.list;

import java.util.LinkedList;

public class LinkedList_poblems {

	public static void main(String[] args) {
		
		LinkedList<String>names=new LinkedList<String>();
		
		names.add("Jhon");
		names.add("Steve");
		names.add("Randy");
		
		names.addFirst("octan");
		names.addLast("Cersi");
		
		System.out.println(names);

		System.out.println(names.get(3));
		
		names.set(3, "Deneryes");
		System.out.println(names);
		 
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
		
		
		
		
	}

}
