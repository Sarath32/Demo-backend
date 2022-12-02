package processchecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class all {
	
	

	public static void main(String[] args) {
		

		// to remove duplicate words
		String a[]={"Welcome","Welcome","java","react"};
		
		List<String>s=Arrays.asList(a);
		
		System.out.println(s);
		
		Set<String>d=new HashSet<String>(s);
		
		System.out.println(d);
	

		
		
	}
}
