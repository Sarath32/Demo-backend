package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodsofLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String>data=new LinkedList<String>();
		
		List<String>data1=new ArrayList<>() ;
		
		data1.add("Java");
		data1.add("Developer");
		
		data.addAll(data1);
		System.out.println("<<<<<<<<Elements from ArrayList>>>>>>");
		System.out.println(data);
		
		System.out.println("<<<<<<<<<<<<Add elements>>>>>>>>>>");
		
		data.add(1, "Tester");
		System.out.println(data);
		
		System.out.println("<<<<<<<<Where to add Elements from ArrayList>>>>>>");
		
		data.addAll(2, data1);
		System.out.println(data);
		
		
		/*
		 * data.clear(); System.out.println(data);
		 */
		
		Object str=data.clone();
		System.out.println("<<<<<Clone Linkedlist to another object>>>>>>");
		System.out.println(str);
		
		System.out.println("<<<<<Fix any Linkedlist index to another object>>>>>>");

		Object var=data.getLast();
		System.out.println(var);
		System.out.println();
		
		System.out.println("<<<<Return and Remove>>>>");
		Object c=data.poll();
		System.out.println(c);
		
		System.out.println(data);
		
		
		System.out.println("<<<<<Remove First Occurences>>>>>>");
		
		data.removeFirstOccurrence("Developer");
		System.out.println(data);

	}

}
