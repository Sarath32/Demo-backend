package processchecking;

public class countofOccurance {

	public static void main(String[] args) {
		
		String s="Java Core";
		
		
		//Without Looping
		CharSequence k="o";
		
		int  c=s.length()-s.replace(k, "").length();

		System.out.println(c);
		
		
		//With Looping
		char c1='e';
		int count=0;
		for(int i=0; i<s.length();i++)
		{
		   if(s.charAt(i)==c1)
		   {
			   count++;
		   }
		}
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
