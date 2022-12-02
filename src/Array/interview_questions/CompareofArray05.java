package Array.interview_questions;

import java.util.Arrays;

public class CompareofArray05 {

	public static void main(String[] args) {
		
		int a[]= {50,60,58,70};
		int b[]= {70,60,50,58};
		
		if(a.length==b.length)
		{
			
			  Arrays.sort(a); 
			  Arrays.sort(b);
			 
			
			boolean result=Arrays.equals(a,b);
			
			if(result)
			{	
				System.out.println("They are equal");
			}
			else
			{
				System.out.println("They are not equal");
			}
		}
		else
		{
			System.out.println("They are not equal");
		}
		
		
		
		
		
	}

}
