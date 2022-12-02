package interview_string_questions;

public class TocountwordsintheString {

	public static void main(String[] args) {
		
		String s= "Mahendrasing";
		
		int count=0;
		
		for(int i=0; i<s.length();i++ )
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				//if(s.charAt(i)<='z')
				
					count++;
			}		
			
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
			//	if(s.charAt(i)<='Z')
				
					count++;
			}			
					
			
		}
		
		System.out.println(count);
		
		
		
	}

}
