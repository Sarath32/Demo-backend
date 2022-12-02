package Interview_String02;

public class Reverseastringusingiteration_08 {

	public static void main(String[] args) {
		
		String a="80,23,56,54,84,12";
		
		String s[]=a.split(",");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
			
		}
	}
}
