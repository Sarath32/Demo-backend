package processchecking;

public class REverseString {

	public static void main(String[] args) {
		
		String s="java , developer";
		String f="";
		
	
	for(int i=s.length()-1; i>=0;i--)
	{
		char c=s.charAt(i);
		f=f+c;
	}
		System.out.println(f);
	}

}
