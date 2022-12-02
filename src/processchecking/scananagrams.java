package processchecking;


import java.util.Arrays;
import java.util.Scanner;

public class scananagrams {

	public static boolean anagramsornot(String a,String m) {
		
		char c[]=a.toCharArray();
		char[] c1=m.toCharArray();
		
		if(c.length==c1.length)
		{
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			boolean w=Arrays.equals(c,c1);
			
			if(w)
			{
				return true;
			}
			return false;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter the word1 : ");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		System.out.print("Enter the word2 : ");
		Scanner sc1=new Scanner(System.in);
		String m=sc1.next();
		
		System.out.println("The both words are anagram ---> "+anagramsornot(a, m));
	}
	
}
