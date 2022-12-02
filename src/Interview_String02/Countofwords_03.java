package Interview_String02;

public class Countofwords_03 {

	
	public static void main(String[] args) {
		
		String a="java,c,c++,react";
		
		String s[]=a.split(",");
		int c=0;
		for(int i=0;i<s.length;i++)
		{
			c++;
		}
		
		System.out.println(c);
	}
}
