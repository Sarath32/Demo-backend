package mock_test;

import java.util.Map;
import java.util.TreeMap;

public class countofoccurances {

	
	public static void main(String[] args) {
		
		String a="jajarjiuv";
		
		char s[]=a.toCharArray();
		Map<Character, Integer> m=new TreeMap<Character, Integer>();
		
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			for(int j=0;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					count++;
					
				}
			}
			m.put(s[i], count);
			
		}
		
		System.out.println(m);
		
	}
}
