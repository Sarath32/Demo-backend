package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Problems {

	public static void main(String[] args) {

		List<String>names=new ArrayList<String>();
		
		names.add("Jhon");
		names.add("Steve");
		names.add("Randy");
		names.add("Hardy");
		names.add("Eddie");
		names.add("Larry");
		
		System.out.println(names);
		
		System.out.println("Adding of one element in mid :");
		
		names.add(2, "gopal");
	
		System.out.println(names);
 	
		System.out.println();
		System.out.println("Remove of one element in mid :");
		
		names.remove(2);
		System.out.println(names);
		
		names.remove("Jhon");
		System.out.println(names);
		
		names.set(1,"Rock");
		System.out.println(names);
		
		System.out.println(names.get(2));
		
		System.out.println(names.contains("Eddie"));
		
		System.out.println("The List of Array after Sort");
		Collections.sort(names);
		
		System.out.println(names);
		
		Collections.sort(names,Collections.reverseOrder());
		
		System.out.println("Decending Order :");
		
		System.out.println(names);
		
		/*
		 * names.clear(); System.out.println(names);
		 */
		
	}

}
