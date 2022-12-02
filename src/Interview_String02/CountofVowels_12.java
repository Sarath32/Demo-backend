package Interview_String02;

import java.util.Scanner;

public class CountofVowels_12 {

	public static void main(String[] args) {
		 
		System.out.println("Enter your String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    int vcount=0;
	    int ccount=0;
	    s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
			{
				vcount++;	
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				ccount++;
			}
					
		}
		
		System.out.println("vowels - "+vcount);
		System.out.println("constant - "+ccount);
	}
	
}
