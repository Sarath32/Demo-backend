package processchecking;

public class swapoftwostrings {

	public static void main(String[] args) {

		String a="java";
		String c="react";
		
		a=a+c;
		
		c=a.substring(0,(a.length()-c.length()));
		
		a=a.substring(c.length());
		
		System.out.println(a);
		
	}

}
