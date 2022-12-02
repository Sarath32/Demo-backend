package Array.interview_questions02;

import java.util.Arrays;

public class Intersection_11 {

	public static void main(String[] args) {
		
		int a[]= {56,48,23,52,15,89,13};
		int s[]= {80,90,56,48,23,16};
		
		Arrays.sort(a);
		Arrays.sort(s);
		
		for(int i=0;i<a.length;i++)
		{   
			for(int j=0;j<s.length;j++)
		
		{
				
		
			if(a[i]==s[j])
			{
				System.out.println(a[i]);
			}
		}}
		
	}
	
	
}
