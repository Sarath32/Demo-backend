package Interview_String01;

public class CountOfCharacdtesr03 {

	public static void main(String[] args) {

		String s="Welcome to Trio Tend";
		
		int count=0;
				
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				count++;
			}
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
			}
		}
	
					System.out.println(count);

	}

}
