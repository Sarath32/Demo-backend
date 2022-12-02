package interview_string_questions;

public class Countofoccurrances {

	public static void main(String[] args) {
	
		String s="java is a wounderful language";
		
		
		//without using looping
		
		int count=s.length() - s.replace("j","").length();
		
		System.out.println(count);
		
		
		
		
		//using looping
		int count1=0;
		char tofind='j';
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==tofind)
			{
				count1++;
			}
				
			
		}
		System.out.println(count1);
		
	}

}
