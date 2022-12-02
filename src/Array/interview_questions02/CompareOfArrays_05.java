package Array.interview_questions02;

import java.util.Arrays;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class CompareOfArrays_05 {

	static boolean compare(String a[],String d[]) {
		
		if(a.length==d.length)
		{
			Arrays.sort(a);
			Arrays.sort(d);
			
			boolean result=Arrays.equals(a, d);
			if(result)
			{
				return true;
			}
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String s[]= {"java","c","c++","react"};
		String v[]= {"c","c++","react","java"};
		
		System.out.println(compare(s, v));
	}
}
