package Interview_String02;

import java.util.Scanner;

public class Countofoccurance_04 {

	 static int subsrting_rec(String str, String sub){
	      if (str.contains(sub))
	      {
	    	  
	         return 1 + subsrting_rec(str.replaceFirst(sub, ""),sub);
	         
	         
	      }
	      return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter your String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println("Enter your letters");
		Scanner sc1=new Scanner(System.in);
		String s1=sc1.next();
		
		System.out.println("Occurances"+subsrting_rec(s, s1));
		
	}
}
