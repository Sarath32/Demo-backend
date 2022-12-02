package Interview_String02;

public class Onlydigit_09 {

	static boolean onlydigit(String a) {
		
		for(int i=0;i<a.length();i++)
		{
				if(a.charAt(i)>='a' && a.charAt(i)<='z' ||
						a.charAt(i)>='A' && a.charAt(i)<='Z')
				{
					return false;
				}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String s="02";
		System.out.println(onlydigit(s));
	}
}
