package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conversionofarraytolisttoarray {

	public static void main(String[] args) {
		
		String s[]= {"java","react","c"};
		
		//Conversion of Array to Arraylist
		
		List<String>li=new ArrayList<String>(Arrays.asList(s));
		li.add("c++");
		li.add("Spring");
		for (String str : li) {
			System.out.println(str);
		}
		
		//Conversion of Arraylist to Array
		
		String a[]=li.toArray(new String[li.size()]);
		for(int i=0;i<a.length;i++)
		{
		   System.out.println(a[i]);
		}
	}
}
