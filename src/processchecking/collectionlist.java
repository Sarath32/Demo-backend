package processchecking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionlist {

	public static void main(String[] args) {

		List<String>oj=new ArrayList<String>();
		oj.add("reactjs");
		oj.add("core java");
		oj.add("spring");
		oj.add("Spring boot");
		oj.set(3, "summa");
		
		System.out.println(oj);
		System.out.println(oj.get(2));
		System.out.println("The index value of Spring boot is "+oj.indexOf("Spring boot"));
		System.out.println("The size of the array list is "+oj.size());
	
	    System.out.println("<----using while loop---->");
	     
	    int i=0;
	    while(i<oj.size())
	    {
	    	System.out.println(oj.get(i));
	    	i++;
	    	
	    }
	    
	    System.out.println("<----using for loop---->");
         
	     for( i=0;i<oj.size();i++)
	     {
	    	System.out.println(oj.get(i)); 
	     }
	
	     
		    System.out.println("<----using for each---->");

		    for (String str : oj) {
				System.out.println(str);
			}
		    
		    
		    System.out.println("<----using iterator---->");
  
		    Iterator<String>it=oj.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
		    
		    
	}

}
