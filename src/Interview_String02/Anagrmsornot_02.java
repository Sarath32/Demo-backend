package Interview_String02;

import java.util.Arrays;

public class Anagrmsornot_02 {

	public static boolean anagrams(String a,String x) {
		
		a=a.toLowerCase();
		x=x.toLowerCase();
		
		if(a.length()==x.length())
		{
			char c[]=a.toCharArray();
			char c1[]=x.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			boolean result=Arrays.equals(c, c1);
			
			if(result)
			{
				return true;
			}
			return false;
			
		}
		return false;
	}
	
	public static void main(String[] args) {

		String a="care";
		String x="raca";
		
		System.out.println(anagrams(a, x));
	}

}
