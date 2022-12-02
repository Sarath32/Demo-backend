package Array.interview_questions01;

import java.util.Arrays;

public class CompareofArrays05 {
		
	
	public static boolean compare(String str[],String st[]) {
		
		if(str.length==st.length)
		{
			Arrays.sort(str);
			Arrays.sort(st);
			
			if(Arrays.equals(str, st))
			{
				return true;
			}
			return false;
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String s[]= {"race","care","rest"};
		String a[]= {"care","race","rest"};
		
		System.out.println("The Array s and a are equal --> "+compare(s, a));
		

	}

}
