package interview_string_questions;

public class Firstnonrepetedcharacter {

	public static void main(String[] args) {
		
		String s="welcome";
		
		for(int i=0; i<s.length(); i++)
		{
		char c=s.charAt(i);
			boolean result = true;
			
			for(int j=i+1; j<s.length(); j++)
			{
				if(c==s.charAt(j))
				{
					result=false;
				}
					
			    
				
				}if(result==true)
				    
					{
							System.out.println(c);
							System.exit(0);
						}	
				
			
		}
		
		
		
		
	}

	
		
	}
