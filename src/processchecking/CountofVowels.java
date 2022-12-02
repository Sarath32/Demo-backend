package processchecking;

import java.util.Scanner;

public class CountofVowels {

	public static boolean countvowels(String a) {
		
		for(int i=0;i<a.length();i++)
		{
		  if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
				{
					return true;
				}		
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int c=s.length();
		System.out.println("The String contain vowels --> "+countvowels(s));
	}
	
	
	
}
