package collectionPrograms;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		Set<String>hs=new java.util.HashSet<String>();
		hs.add("java");
		hs.add("c++");
		hs.add("c");
		hs.add("c++");
		
		for (String str : hs) {
			
			System.out.println(str);
		}
		Iterator<String>it=hs.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}
}
