package interview_string_questions;

public class FindIfStringContainOnlyDigits9 {

	public static void main(String[] args) {
		
		String s="6000028";
		
		char c[]=s.toCharArray();
		
		for(int i=0; i<s.length();i++)
		{
			if(c[i]>='0' && c[i]<='9');

			else
			{
			System.out.println("The String Contain not only digits");
			System.exit(0);
			}
			
		}
		
		
		System.out.println("The String Contain only digits");

	}

}
