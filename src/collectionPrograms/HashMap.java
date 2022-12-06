package collectionPrograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		
		Map<Integer,String>m=new java.util.HashMap<Integer, String>();
		
		m.put(1, "Cersi");
		m.put(2, "Lannister");
		m.put(3, "Jammie");
		m.put(4, "Cersi");
		
		// To print values only
		Iterator<String>i=m.values().iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		// To print key only
				Iterator<Integer>s=m.keySet().iterator();
				
				while(s.hasNext()) {
					System.out.print(s.next()+" ");
				}
				
				// To print key & Value 
				
				Iterator<Entry<Integer, String>>es=m.entrySet().iterator();
				
				while(es.hasNext()) {
					System.out.print(es.next()+" ");
				}
		
		
	}
}
