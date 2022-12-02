package stringquestions;

import java.util.Scanner;

public class Count_of_Occurences_substring {

	
	   static int subsrting_rec(String str, String sub){
	      if (str.contains(sub))
	      {
	    	  
	         return 1 + subsrting_rec(str.replaceFirst(sub, ""),sub);
	         
	         
	      }
	      return 0;
	   }
	   public static void main(String[] args) {
		   
		   Scanner sc=new Scanner(System.in);
		   String str2
		   =sc.next();
			
			  String str1 = "welcome to java";
		      System.out.println("Count of occurrences of a substring recursively are: "+subsrting_rec(str1, str2));
		   }

	}


