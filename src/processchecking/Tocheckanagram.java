package processchecking;

import java.util.Arrays;

public class Tocheckanagram {

	public static void main(String[] args) {
		String str ="Listen";
		String vj ="Silent";
		
		str = str.toLowerCase();
		vj=vj.toLowerCase();
		
		char str1[]=str.toCharArray();
		char vj1[]=vj.toCharArray();
		
		if(str.length()==vj.length())
		{
			Arrays.sort(str1);
			Arrays.sort(vj1);
			
			boolean result = Arrays.equals(str1, vj1);
			
			if(result)
			{
				System.out.println("They are anagrams");
			}
			else
			{
				System.out.println("They are not anagrams");
			}
		}
		else
		{
			System.out.println("They are not anagrams");
		}
		
		
		
		
		
		
	}

}
