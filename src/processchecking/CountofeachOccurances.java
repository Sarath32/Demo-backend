package processchecking;

import java.util.Map;
import java.util.TreeMap;

public class CountofeachOccurances {

	public static void main(String[] args) {
		
		
		String a= "welcome";
		
		a=a.replace(" ", "");
		
		char c[]=a.toCharArray();
		
		Map<Character, Integer>m=new  TreeMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			int count =0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
						
			}
			
			m.put(c[i], count);
			
		}
		
		System.out.println(m);
		
	}
}
