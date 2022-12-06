package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		//1.Write a program to traverse(or iterate) Arraylist?		
		
	    List< String>l=new ArrayList<String>();
	    
	    l.add("Cersi");
	    l.add("Snow");
        l.add("Robert");
        l.add("Jhon");
        
        
        
        for(int i=0;i<l.size();i++)
        {
        	System.out.println(l.get(i));
        }
        
        Iterator<String>it=l.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        for (String str : l) {
			System.out.println(str);
		}
        
      
	}
		
}
