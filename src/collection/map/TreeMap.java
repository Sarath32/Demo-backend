package collection.map;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		
		Map<Integer,String>Student= new java.util.TreeMap<Integer,String>();
		
		Student.put(56,"Java");
		Student.put(46,"Spring boot");
		Student.put(84,"Phyton");
		Student.put(51,"c++");
		Student.put(32,"c");
		
		Student.forEach((S,V)->System.out.println("The Student roll no is-->"+S+" The Student name is--->"+V));
	
	    Iterator<java.util.Map.Entry<Integer, String>>et=Student.entrySet().iterator();
	    while(et.hasNext())
	    {
	    	System.out.println(et.next());
	    }
		
		Iterator<Integer>it3=Student.keySet().iterator();
		while(it3.hasNext())
		{
			System.out.println(Student.get(it3.next()));
		}
	    
	    
	    
	
	}

}
