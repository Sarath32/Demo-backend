package collection.set;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {

		Set<Integer>num=new java.util.TreeSet<Integer>();
		
		num.add(58);
		num.add(85);
		num.add(25);
		num.add(12);
		num.add(96);
		num.add(35);
		
		System.out.println(num.size());
		System.out.println(num);
		System.out.println("ForEach Loop");
		for (Integer str : num) {
			System.out.println(str);
			
		}
		System.out.println("Iterator Loop");
		
		Iterator<Integer>it=num.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(num.contains(25));
		
		num.clear();
		System.out.println(num.isEmpty());
		
		

	}

}
