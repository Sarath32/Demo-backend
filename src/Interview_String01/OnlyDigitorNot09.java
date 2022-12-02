package Interview_String01;

public class OnlyDigitorNot09 {
	
	public static boolean onlydigit(String str,int v) {
		
		for(int i=0; i<v; i++)
		{
			if(str.charAt(i)>='a'&& str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)>='Z')
			{
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		String s="1m";
		
		int w=s.length();
		
		System.out.println("The String contain only Digits ---> "+onlydigit(s, w));
	}
	
	
}

	