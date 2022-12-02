package Interview_String02;

public class Palindrom_15 {
	
	static boolean palin(String a,String rev) {
		
		rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		if(a.equalsIgnoreCase(rev))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String a="madaM";
		String rev="";
		
		System.out.println(palin(a, rev));
	}
}
