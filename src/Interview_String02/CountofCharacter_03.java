package Interview_String02;

public class CountofCharacter_03 {

	public static void main(String[] args) {
		
		String s="welcome to java123";
		
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				c++;
			}
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				c++;
			}
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				c++;
			}
			
			
		}
		System.out.println(c);
	}
}
