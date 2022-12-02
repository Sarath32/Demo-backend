package processchecking;

import java.util.Arrays;

public class anagramsornot {

	public static boolean anagrams(String a,String c) {
		
		char [] v=a.toCharArray();
		char []f=c.toCharArray();
		
		if(v.length==f.length)
		{
			Arrays.sort(v);
			Arrays.sort(f);
			boolean b;
			if( b=Arrays.equals(v,f))
			{
				return true;
			}
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String a="race";
		String z="care";
		System.out.println("The Both Strings are anagrams --> "+anagrams(a, z));
		
		
		
	}
}
