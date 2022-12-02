package Interview_String01;

public class PalindromeORnot15 {

	public static boolean palindrome(String str,String rev,int n) {
		
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		String s="Madam";
		String rev="";
		int n=s.length();
		
		System.out.println("The String is Palindrome ----> "+palindrome(s, rev, n));
		
	}

}
