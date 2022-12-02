package Array.interview_questions01;

import java.util.Arrays;

public class IntersectionofArrays11 {

	public static void main(String[] args) {
		
		int a[]= {80,56,2,14,25,36};
		int s[]= {56,23,6,45,80,36};
		
		  Arrays.sort(a); Arrays.sort(s);
		 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(a[i]==s[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		
		
		
	}
	
	
}
