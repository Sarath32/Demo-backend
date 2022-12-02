package processchecking;

import java.util.Scanner;

public class scanpalindrom {

	public static boolean palindromeornot(String a,String rev) {
		
		rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		 
		if(rev.equalsIgnoreCase(a))
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		System.out.print("Enter the word : ");
		Scanner sc=new Scanner (System.in);
		String a=sc.next();
		
		String rev="";
		System.out.println("The word is palindrome --> "+palindromeornot(a, rev));
		
	}
	
}
