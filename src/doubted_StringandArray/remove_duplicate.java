package doubted_StringandArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import collection.list.Arraylist;
import collection.set.HashSet;

public class remove_duplicate {

	public static void main(String[] args) {
		
		
		String a[]= {"java","react","java","c++","c","sprig","c++"};
		
		//method 1  
	    ArrayList<String>al=new ArrayList<String>();
		Collections.addAll(al, a);
		System.out.println(al);
		
		//method 2
		
		List<String>all=Arrays.asList(a);
		
		System.out.println(all);
		
		//After removal of duplicates
		LinkedHashSet lh=new LinkedHashSet(all);
		
		System.out.println(lh);
		
	}
}
