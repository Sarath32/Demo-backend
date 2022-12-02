package Interview_String01;

import java.util.Arrays;

public class AnagramsOrNot02 {

	public static void main(String[] args) {

		String a="Race";
		String b="Care";
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()==b.length())
		{
		   char c[]=a.toCharArray();
		   char c1[]=b.toCharArray();
		   
		   Arrays.sort(c);
		   Arrays.sort(c1);
		   
		   boolean result=Arrays.equals(c, c1);
		   if(result )
		   {
			   System.out.println(a+" and "+b+" are Anagrams");
		   }
		   else
		   {
			   System.out.println(a+" and "+b+" are not Anagrams");
		   }
			   
		}
		else
		{
			System.out.println(a+" and "+b+" are not Anagrams");
	
		}
		

	}

}
