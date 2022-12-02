package doubted_StringandArray;

import java.util.Map;
import java.util.TreeMap;

public class CountofEachOccurances_04 {

    public static void main(String[] args) {
		
    	String a="Welcome to java";
    	
    	a=a.replaceAll(" ", "");
    	char c[]=a.toCharArray();
    	
    	Map<Character,Integer> map=new TreeMap<Character, Integer>();
    	
    	
    	for(int i=0;i<a.length();i++)
    	{
    		int count=0;
    		for(int j=0;j<a.length();j++)
    		{
    			if(c[i]==c[j])
    			{
    				count++;
    			}
    		}
    		
    		map.put(c[i], count);
    	}
    	
    	
    	System.out.println(map);
	}	

}
