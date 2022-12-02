package interview_string_questions;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		String s="AAbbAA";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(rev.equals(s))
		{
			System.out.println("The strings are palindrome");
		}
		else
		{
			System.out.println("The Strings are not palindrome");
		}
	}

}
