package processchecking;

public class TocountWords {

	public static void main(String[] args) {
		
		String s="Chennai 600028";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' &&  s.charAt(i)<='z')
			{
				count++;
			}
			if(s.charAt(i)>='A' &&  s.charAt(i)<='Z')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
