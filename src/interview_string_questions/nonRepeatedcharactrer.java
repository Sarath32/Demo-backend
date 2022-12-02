package interview_string_questions;

public class nonRepeatedcharactrer {

	public static void main(String[] args) {
		
		String word="sarath";
		
		for(int i=0; i<word.length(); i++)
		{
			boolean b=true;
			char c=word.charAt(i);
			
		  for(int j=i+1; j<word.length(); j++)
		  {
			  if (c==word.charAt(j))
			  {
				  b=false;
			  }
		  }
			if(b)
			{
				System.out.println(c);
			}
		  
		  
		}
		
		
		
		

	}

}
