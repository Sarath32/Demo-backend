package interview_string_questions;

public class Toreversestring {

	public static void main(String[] args) {
		
		
      String names= "Ganeshamoorthy";
      
      // To store it in another String
      
      String rev="";
      
      
   int len=names.length();
   for(int i=len-1; i>=0; i--)
      {
   rev=rev+names.charAt(i);
    	  
      }
		System.out.println(rev);
		
			
		// To Store in same String
		
		for(int i=names.length()-1; i>=0; i--)
		{
			System.out.print(names.charAt(i));
		}
			
			
			
			
	}

}
