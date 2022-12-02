package mock_test;

import java.util.Scanner;

import IOstreams.SequenceInputOutput.inputandoutput;

public class Reverseandsimilar {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The Similar letter in String after reversing is :");
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==rev.charAt(i))
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
	}
}
