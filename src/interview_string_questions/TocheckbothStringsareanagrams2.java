package interview_string_questions;

import java.util.Arrays;

public class TocheckbothStringsareanagrams2 {

	public static void main(String[] args) {
		
	String s1="races";
	String s2="care";

	char c1[]= s1.toCharArray();
	char c2[]= s2.toCharArray();
	
	
	if(c1.length==c2.length)
	{	
	Arrays.sort(c1);
	Arrays.sort(c2);
		
    boolean result = Arrays.equals(c1, c2); 		
			
    
    
    		if(result)
	{
		System.out.println(s1+" and "+s2+" are anagrams.");
	}
	else
	{
		System.out.println(s1+" and "+s2+" are not anagrams.");
	}
	 
	}
	else
	{
		System.out.println(s1+" and "+s2+" are not anagrams.");
	}
		
		
	

}
}