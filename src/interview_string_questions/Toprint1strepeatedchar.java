package interview_string_questions;

public class Toprint1strepeatedchar {

	public static void main(String[] args) {
		
		String s="welcome";
		
		s=s.toLowerCase();
		
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			
			for(int j=i+1; j<s.length();j++)
			{
				if(c==s.charAt(j))
				{
				System.out.println(c);
				System.exit(0);
				}
			}
			}
		
	
		

	}

}
