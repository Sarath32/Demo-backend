package collection.list;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		
		Vector<String>d=new Vector<String>(3);
		d.add("java");
		d.add("Spring");
		d.add("Spring");
		d.add("c++");
		d.add("c");
		System.out.println(d.size());
		System.out.println(d.capacity());
		d.addElement("Developer");
		d.addElement("Tester");
		System.out.println(d.size());
		System.out.println(d.capacity());
		System.out.println(d);
		
		System.out.println("<<<<<<Using For Each>>>>>>");
		for (String str : d) {
			System.out.println(str);
		}
	}

}
