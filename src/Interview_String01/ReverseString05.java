package Interview_String01;

public class ReverseString05 {

	public static void main(String[] args) {

		String a="Welcome to java";
		
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);

	}

}
