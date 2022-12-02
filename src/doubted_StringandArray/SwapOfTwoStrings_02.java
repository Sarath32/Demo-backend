package doubted_StringandArray;

public class SwapOfTwoStrings_02 {

	public static void main(String[] args) {
		
		//Without variable
		
		String str1="Welcome to java";
		String str2="Welcome to react";
		
		str1=str1+str2;
		
		
		
		//Extract str2 from updated str1
		str2=str1.substring(0,(str1.length()-str2.length()));
		
		
		//Extract str1 from updated str1
		str1=str1.substring(str2.length());
		
		System.out.println(str2);
		
	}
}
