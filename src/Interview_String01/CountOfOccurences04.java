package Interview_String01;

public class CountOfOccurences04 {

	public static void main(String[] args) {
     // Without Using Loop
		String s="Full Stack Developer";
		String key="e";
		int count =s.length()-s.replace(key,"").length();
		
		System.out.println(count);
		
		
	//With Using Loop
		int cou=0;
		char c='u';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
			cou++;
			}
		}
          System.out.println(cou);
	}

}
