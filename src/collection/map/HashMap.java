package collection.map;

import java.awt.RenderingHints.Key;
import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
		
		Map<Integer,String>data=new java.util.HashMap<Integer,String>();
		
		data.put(25, "Jessie Pinkman");
		data.put(30, "Walter White");
		data.put(15,"Rangner Lothbrok");
		data.put(10, "Bjorn Ironside");
		
		System.out.println(data);
		
		System.out.println(data.size());
		
		System.out.println(data.get(15));
		
		data.forEach((R,N)->System.out.println("The Id is-->"+R+" The name is-->"+N));
		System.out.println("<<<<<Keyset>>>>>");
		Iterator<Integer>it=data.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(data.get(it.next()));
		}
		
		System.out.println("<<<<<Entry Set>>>>>>");
		
	    Iterator<java.util.Map.Entry<Integer, String>>et=data.entrySet().iterator();
	    while(et.hasNext())
	    {
	    	System.out.println(et.next());
	    }
		
		
	    System.out.println("<<<<<Remove Data Based on key>>>>");
	    
	    data.remove(25);
	    Iterator<java.util.Map.Entry<Integer, String>>et1=data.entrySet().iterator();
	    while(et1.hasNext())
	    {
	    	System.out.println(et1.next());
	    }
	    
	    System.out.println(data.containsKey(25));
	    System.out.println(data.containsValue("Rangner Lothbrok"));
	    
	   data.keySet();
	   System.out.println(data);
	    
		
	}

}
