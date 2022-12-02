package interview_string_questions;

public class vowels {

	public static void main(String[] args) {
		
	String s="Education";
           s=s.toLowerCase();	
	int vcount=0,ccount=0;
	for(int i=0; i<s.length();i++)
	{
		char c=s.charAt(i);
		
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
		{
			vcount++;
		}
		
		else if (c>='a' && c<='z')
		{
			ccount++;
		}
		
	}
	System.out.println("The number of vowels in the String is "+vcount);
	System.out.println("The number of consonent in the String is "+ccount);
		
		
		
		
		
	}

}
