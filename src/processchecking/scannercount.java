package processchecking;

import java.util.Scanner;

public class scannercount {

	public static void main(String[] args) {
		
		System.out.println("Enter your sentence : ");
		Scanner sc=new Scanner(System.in);
		
		String sentence =sc.nextLine();
		int count=0;
		for(int i=0;i<sentence.length();i++)
		{
			char ch=sentence.charAt(i);
			
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				count++;
			}
		}
		
		System.out.println("The number of vowels is "+count);
	}
}
